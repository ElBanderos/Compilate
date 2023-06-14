package antl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(CompilerParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(CompilerParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(CompilerParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(CompilerParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CompilerParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CompilerParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CompilerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CompilerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CompilerParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CompilerParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaration(CompilerParser.LocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaration(CompilerParser.LocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CompilerParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CompilerParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CompilerParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CompilerParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CompilerParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CompilerParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CompilerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CompilerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CompilerParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CompilerParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CompilerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CompilerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(CompilerParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(CompilerParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(CompilerParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(CompilerParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#arrayAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentStatement(CompilerParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#arrayAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentStatement(CompilerParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(CompilerParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(CompilerParser.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(CompilerParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(CompilerParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CompilerParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CompilerParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(CompilerParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(CompilerParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestedStatement(CompilerParser.NestedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestedStatement(CompilerParser.NestedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CompilerParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CompilerParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(CompilerParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(CompilerParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiationExpression(CompilerParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiationExpression(CompilerParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterthanExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthanExpression(CompilerParser.GreaterthanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterthanExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthanExpression(CompilerParser.GreaterthanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInstantiationExpression(CompilerParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInstantiationExpression(CompilerParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(CompilerParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(CompilerParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(CompilerParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(CompilerParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(CompilerParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(CompilerParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(CompilerParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(CompilerParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLitExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolLitExpression(CompilerParser.BoolLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLitExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolLitExpression(CompilerParser.BoolLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(CompilerParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(CompilerParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(CompilerParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(CompilerParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CompilerParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CompilerParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(CompilerParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(CompilerParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(CompilerParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(CompilerParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(CompilerParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(CompilerParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldAccessExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccessExpression(CompilerParser.FieldAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldAccessExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccessExpression(CompilerParser.FieldAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(CompilerParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(CompilerParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(CompilerParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(CompilerParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CompilerParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CompilerParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacterExpression(CompilerParser.CharacterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacterExpression(CompilerParser.CharacterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLitExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLitExpression(CompilerParser.IntegerLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLitExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLitExpression(CompilerParser.IntegerLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(CompilerParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(CompilerParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(CompilerParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(CompilerParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#methodCallParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallParams(CompilerParser.MethodCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#methodCallParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallParams(CompilerParser.MethodCallParamsContext ctx);
}