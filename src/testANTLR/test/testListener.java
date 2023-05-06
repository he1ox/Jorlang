// Generated from C:/Users/georg/IdeaProjects/PruebaANTLR\test.g4 by ANTLR 4.12.0
package test;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(testParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(testParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(testParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(testParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declarationWithOptionalAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationWithOptionalAssignment(testParser.DeclarationWithOptionalAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declarationWithOptionalAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationWithOptionalAssignment(testParser.DeclarationWithOptionalAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(testParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(testParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(testParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(testParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(testParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(testParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(testParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(testParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(testParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(testParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(testParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(testParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(testParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(testParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(testParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(testParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(testParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(testParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(testParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(testParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(testParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponent(testParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponent(testParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(testParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(testParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(testParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(testParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(testParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(testParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(testParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(testParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulus(testParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulus(testParser.ModulusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical(testParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical(testParser.LogicalContext ctx);
}