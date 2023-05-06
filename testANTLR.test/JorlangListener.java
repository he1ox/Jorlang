// Generated from C:/Users/georg/IdeaProjects/PruebaANTLR\Jorlang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JorlangParser}.
 */
public interface JorlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JorlangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JorlangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JorlangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JorlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JorlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JorlangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JorlangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#declarationWithOptionalAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationWithOptionalAssignment(JorlangParser.DeclarationWithOptionalAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#declarationWithOptionalAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationWithOptionalAssignment(JorlangParser.DeclarationWithOptionalAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JorlangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JorlangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JorlangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JorlangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JorlangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JorlangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JorlangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JorlangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JorlangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JorlangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JorlangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JorlangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JorlangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JorlangParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JorlangParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JorlangParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JorlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JorlangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JorlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JorlangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JorlangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JorlangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JorlangParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JorlangParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponent(JorlangParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponent(JorlangParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(JorlangParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(JorlangParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(JorlangParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(JorlangParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JorlangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JorlangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(JorlangParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(JorlangParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulus(JorlangParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulus(JorlangParser.ModulusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical(JorlangParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link JorlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical(JorlangParser.LogicalContext ctx);
}