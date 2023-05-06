// Generated from C:/Users/georg/IdeaProjects/PruebaANTLR\Jorlang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JorlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JorlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JorlangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(JorlangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JorlangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JorlangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#declarationWithOptionalAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationWithOptionalAssignment(JorlangParser.DeclarationWithOptionalAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JorlangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(JorlangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JorlangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JorlangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JorlangParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JorlangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JorlangParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JorlangParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JorlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JorlangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JorlangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JorlangParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(JorlangParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(JorlangParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(JorlangParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JorlangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(JorlangParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulus(JorlangParser.ModulusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(JorlangParser.LogicalContext ctx);
}