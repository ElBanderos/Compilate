package antl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(CompilerParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(CompilerParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CompilerParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CompilerParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(CompilerParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaration(CompilerParser.LocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CompilerParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CompilerParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CompilerParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CompilerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CompilerParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CompilerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(CompilerParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(CompilerParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#arrayAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentStatement(CompilerParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(CompilerParser.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(CompilerParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CompilerParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(CompilerParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedStatement(CompilerParser.NestedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CompilerParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#methodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStatement(CompilerParser.MethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantiationExpression(CompilerParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterthanExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthanExpression(CompilerParser.GreaterthanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInstantiationExpression(CompilerParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(CompilerParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(CompilerParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(CompilerParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(CompilerParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLitExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLitExpression(CompilerParser.BoolLitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(CompilerParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(CompilerParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CompilerParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(CompilerParser.ArrayAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(CompilerParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(CompilerParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccessExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccessExpression(CompilerParser.FieldAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(CompilerParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(CompilerParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CompilerParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterExpression(CompilerParser.CharacterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLitExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLitExpression(CompilerParser.IntegerLitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(CompilerParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(CompilerParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#methodCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallParams(CompilerParser.MethodCallParamsContext ctx);
}