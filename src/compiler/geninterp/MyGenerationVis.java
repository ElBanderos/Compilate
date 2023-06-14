package compiler.geninterp;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import antl.CompilerBaseVisitor;
import compiler.language.*;
import compiler.language.Class;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import antl.CompilerParser.*;

@SuppressWarnings("rawtypes")
public class MyGenerationVis extends CompilerBaseVisitor implements ByteCode {

	private MyCharacter tab;
	private compiler.language.Function currFunction;
	private String currClass;
	private File classFile;
	private int nextVariable;

	public MyGenerationVis(MyCharacter visitedST) {
		this.setTab(visitedST);
		this.setClassfile(new File());
		setIC(0);
	}

	@Override
	public Object visitMethodDeclaration(MethodDeclarationContext ctx) {
		int i = 0;
		if (ctx.getChild(0) instanceof TerminalNodeImpl && ctx.getChild(0).getText().equals("public")) i++;
		i++;
		String mName = ctx.getChild(i++).getText();
		setCurrMethod((compiler.language.Function) tab.lookup(currClass + "."
				+ mName));
		currFunction.setList(currFunction.getParamList());
		currFunction.setList(currFunction.getVarList());
		Function method = new Function();
		method.setCatalog(currFunction.getList());
		for (int k = 0; k < method.getCatalog().size(); k++) method.getVarList().add(k, 0);
		classFile.addMethod(currClass + "." + currFunction.getId(), method);

		nextVariable = 0;
		for (int j = currFunction.getParamList().size() - 1; j >= 0; j--)
		{
			addInstruction(STORE, j);
			nextVariable++;
		}
		tab.enterScope();
		while (!(ctx.getChild(i) instanceof MethodBodyContext)) i++;
		visitMethodBody((MethodBodyContext) ctx.getChild(i));
		tab.exitScope();
		return null;
	}

	@Override
	public Object visitMethodCallExpression(MethodCallExpressionContext ctx) {
		int i = 0;
		String className = (String) visit(ctx.getChild(i++));
		Class classRec = (Class) tab.lookup(className);
		compiler.language.Function mRec;
		int n = ctx.getChildCount();
		i = i + 1;
		for (; i < n; i++) {
			String mName = ctx.getChild(i).getText();
			mRec = classRec.getMethodList().get(mName);
			i += 1;
			visitMethodCallParams((MethodCallParamsContext) ctx.getChild(i));
			addInstruction(INVOKE, className + "." + mName);
			nextVariable++;
			className = mRec.getType();
		}
		return null;
	}

	@Override
	public Object visitVariableAssignmentStatement(VariableAssignmentStatementContext ctx) {
		String LHS = ctx.getChild(0).getChild(0).getText();
		Var lookup = (Var) tab.lookup(LHS);
		visit(ctx.getChild(2));
		addInstruction(STORE, currFunction.getList().indexOf(lookup));
		nextVariable++;
		return null;
	}

	@Override
	public Object visitIdentifier(IdentifierContext ctx) {
		String varName = ctx.getText();
		tab.lookup(varName);
		return null;
	}
	
	@Override
	public Object visitThisExpression(ThisExpressionContext ctx) {
		return tab.getCurrentClass().getId();
	}

	@Override
	public Object visitIdentifierExpression(IdentifierExpressionContext ctx) {
		String varName = ctx.getText();
		MyNode varRec = tab.lookup(varName);
		if (varRec == null) return null;
		addInstruction(LOAD, currFunction.getList().indexOf(varRec));
		nextVariable++;
		return null;
	}

	@Override
	public Object visitIntegerLitExpression(IntegerLitExpressionContext ctx) {
		int value = Integer.parseInt(ctx.getText());
		addInstruction(CONST, value);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitBoolLitExpression(BoolLitExpressionContext ctx) {
		String value = ctx.getText();
		if (value.equals("true")) addInstruction(CONST, 1);
		if (value.equals("false")) addInstruction(CONST, 0);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitReturnStatement(ReturnStatementContext ctx) {
		visit(ctx.getChild(1));
		addInstruction(RETURN, null);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitWhileStatement(WhileStatementContext ctx) {
		int go_to = nextVariable;
		visit(ctx.getChild(2));
		int ifFail = nextVariable;
		addInstruction(IF_FALSE, null); nextVariable++;
		visit(ctx.getChild(4)); addInstruction(GOTO, go_to); nextVariable++;
		Function method = classFile.getMethods().get(currClass + "." + currFunction.getId());
		method.getInstList().get(ifFail).setArgument(nextVariable);
		return null;
	}

	@Override
	public Object visitPrintStatement(PrintStatementContext ctx) {
		visit(ctx.getChild(2));
		addInstruction(PRINT, null); nextVariable++;
		return null;
	}

	@Override
	public Object visitIfElseStatement(IfElseStatementContext ctx) {
		visit(ctx.getChild(2));
		int ifLabel = nextVariable;
		addInstruction(IF_FALSE, null); nextVariable++;
		visit(ctx.getChild(4)); int gotoLabel = nextVariable;
		addInstruction(GOTO, null); nextVariable++;
		Function method = classFile.getMethods().get(currClass + "." + currFunction.getId());
		method.getInstList().get(ifLabel).setArgument(nextVariable);
		if (ctx.getChildCount() > 4) {
			visit(ctx.getChild(6));
			method.getInstList().get(gotoLabel).setArgument(nextVariable);
		}
		return null;
	}

	@Override
	public Object visitLessThanExpression(LessThanExpressionContext ctx) {
		int n = ctx.getChildCount();
		visit(ctx.getChild(0));
		if (n > 3) visit(ctx.getChild(3));
		else visit(ctx.getChild(2));
		addInstruction(ILT, null);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitMulExpression(MulExpressionContext ctx) {
		visit(ctx.getChild(0));
		visit(ctx.getChild(2));
		addInstruction(MULTI, null);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitAddExpression(AddExpressionContext ctx) {
		visit(ctx.getChild(0));
		visit(ctx.getChild(2));
		addInstruction(ADD, null);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitDivExpression(DivExpressionContext ctx) {
		visit(ctx.getChild(0));
		visit(ctx.getChild(2));
		addInstruction(DIV, null);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitSubExpression(SubExpressionContext ctx) {
		visit(ctx.getChild(0));
		visit(ctx.getChild(2));
		addInstruction(SUB, null);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitNotExpression(NotExpressionContext ctx) {
		visit(ctx.getChild(1));
		addInstruction(NO, null);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitMainClass(MainClassContext ctx) {
		setCurrClass(ctx.getChild(1).getText());
		tab.enterScope();
		visitMainMethod((MainMethodContext) ctx.getChild(3));
		tab.exitScope();
		addInstruction(STOP, null);
		nextVariable++;
		return null;
	}

	@Override
	public Object visitMainMethod(MainMethodContext ctx) {
		setCurrMethod((compiler.language.Function) tab.lookup(currClass + ".main"));
		Function method = new Function();
		classFile.addMethod(currClass + "." + currFunction.getId(), method);
		classFile.setMainMethod(method);
		tab.enterScope();
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (ctx.getChild(i) instanceof StatementContext) {
				visitStatement((StatementContext) ctx.getChild(i));
			}
		}
		tab.exitScope();
		return null;
	}

	@Override
	public Object visitClassDeclaration(ClassDeclarationContext ctx) {
		int i = 1;
		int n = ctx.getChildCount();
		currClass = ctx.getChild(i++).getText();
		i++;
		tab.enterScope();
		for (; i < n - 1; i++) {
			ParseTree child = ctx.getChild(i);
			if (child instanceof FieldDeclarationContext) System.err.println(errorMessage(child) +
					"We should not have Field-Declaration");
			else visitMethodDeclaration((MethodDeclarationContext) child);
		}
		tab.exitScope();
		return null;
	}

	@Override
	public Object visitObjectInstantiationExpression(ObjectInstantiationExpressionContext ctx) {
		return ctx.getChild(1).getText();
	}

	private String errorMessage(ParseTree ctx) {
		return "err - " + ((ParserRuleContext) ctx).getStart().getLine()
				+ " : " + ((ParserRuleContext) ctx).getStop().getCharPositionInLine();
	}

	private void addInstruction(int code, Object arg) {
		CodeArguments inst = new CodeArguments(code, arg);
		Function method = classFile.getMethods().get(
				currClass + "." + currFunction.getId());
		method.setInstList(inst);
	}

	public void writeFile(String fileName) {
		FileOutputStream fileToGo;
		ObjectOutputStream objectOut;
		try {
			java.io.File file = new java.io.File(fileName + ".amsv");
			file.getParentFile().mkdirs();
			fileToGo = new FileOutputStream(file,false);
			objectOut = new ObjectOutputStream(fileToGo); objectOut.writeObject(classFile); objectOut.close();
		} catch (Exception e) {
			System.err.println("Ошибка в создании '" + fileName + ".amsv' ");
			e.printStackTrace();
		}
	}

	public void setClassfile(File classfile)
	{
		this.classFile = classfile;
	}

	public void setCurrClass(String currClass) {
		this.currClass = currClass;
	}

	public void setCurrMethod(compiler.language.Function currFunction) {
		this.currFunction = currFunction;
	}

	public void setTab(MyCharacter tab) {
		this.tab = tab;
	}

	public void setIC(int iC) {
		nextVariable = iC;
	}
}
