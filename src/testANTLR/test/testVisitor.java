// Generated from C:/Users/georg/IdeaProjects/PruebaANTLR\test.g4 by ANTLR 4.12.0
package test;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(testParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(testParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declarationWithOptionalAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationWithOptionalAssignment(testParser.DeclarationWithOptionalAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(testParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(testParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(testParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(testParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(testParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(testParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(testParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(testParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(testParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(testParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(testParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(testParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(testParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(testParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(testParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulus(testParser.ModulusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(testParser.LogicalContext ctx);
}