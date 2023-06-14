package compiler.runclasses;

import java.io.IOException;

import compiler.language.MyCharacterVis;
import compiler.language.MyCharacter;
import compiler.geninterp.MyGenerationVis;
import antl.CompilerLexer;
import antl.CompilerParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;

public class GenRunner {

	public static void main(String[] args) {

		System.out.println("Run generation...");

		CharStream input;
		String fileName;
		String file;

		if (args.length >= 1) file = args[0];
		else file = "programs-outs/GreaterThan.ajava";

		try {
			input = CharStreams.fromFileName(file);
			fileName = file.substring(0, file.lastIndexOf('.'));
		} catch (IOException e) {
			System.out.println("Непредвиденная ошибка! Проверьте путь к файлу!");
			return;
		}

		CompilerLexer lexer = new CompilerLexer(input);
		CompilerParser parser = new CompilerParser(new BufferedTokenStream(lexer));
		ParseTree tr = parser.program();
		Trees.inspect(tr, parser);

		MyCharacterVis myCharacterVis = new MyCharacterVis();
		MyCharacter visitedST = (MyCharacter) myCharacterVis.visit(tr);

		if (myCharacterVis.getErrorFlag()) System.err.println("Присутствуют ошибки!");
		else {
			visitedST.printTable();
			visitedST.resetTable();
			MyGenerationVis cgv = new MyGenerationVis(visitedST);
			cgv.visit(tr);
			cgv.writeFile(fileName);
		}
	}
}
