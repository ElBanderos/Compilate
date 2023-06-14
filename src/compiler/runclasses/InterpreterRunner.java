package compiler.runclasses;

import compiler.geninterp.InterpreterByteCode;

public class InterpreterRunner {

	public static void main(String[] args) throws Exception {

		System.out.println("Run Interpreter...");

		String file;
		if (args.length >= 1) file = args[0];
		else file = "programs-outs/GreaterThan.amsv";
		/*else {
			System.out.println("""
					Чтобы запустить интерпретацию: java -jar <jar-file> <path-to-file>
					Пример: java -jar Gen.jar GreaterThan.amsv
					""");
			return;
		}*/

		//InterpreterByteCode interpreterCodes = new InterpreterByteCode("files/GreaterThan.amsv");
		InterpreterByteCode interpreterCodes = new InterpreterByteCode(file);
		interpreterCodes.executable();
	}

}
