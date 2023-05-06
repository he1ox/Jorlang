import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import test.testBaseVisitor;
import test.testLexer;
import test.testParser;

import java.util.HashMap;
import java.util.Map;

public class EvaluatorVisitor extends testBaseVisitor<Void> {

    private Map<String, Integer> variables = new HashMap<>();

    @Override
    public Void visitDeclaration(testParser.DeclarationContext ctx) {
        String varName = ctx.ID().getText();
        if (ctx.expression() != null) {
            int value = evaluateExpression(ctx.expression());
            variables.put(varName, value);
        } else {
            variables.put(varName, 0);
        }
        return null;
    }

    @Override
    public Void visitAssignment(testParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        int value = evaluateExpression(ctx.expression());
        variables.put(varName, value);
        return null;
    }

    @Override
    public Void visitPrint(testParser.PrintContext ctx) {
        if (ctx.STRING() != null) {
            String message = ctx.STRING().getText();
            if (ctx.getParent() instanceof testParser.PrintContext) {
                System.out.println(message.substring(1, message.length() - 1));
            } else {
                System.out.print(message.substring(1, message.length() - 1));
            }
        } else {
            String varName = ctx.expression().getText();
            if (ctx.getParent() instanceof testParser.PrintContext) {
                System.out.println(variables.get(varName));
            } else {
                System.out.print(variables.get(varName));
            }
        }
        return null;
    }

    private int evaluateExpression(testParser.ExpressionContext ctx) {
        // Implement the evaluation logic for expressions
        return 0;
    }

    public static void main(String[] args) {
        String input = "print(\"El valor de x es: \");";
        testLexer lexer = new testLexer(CharStreams.fromString(input));
        testParser parser = new testParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();

        EvaluatorVisitor visitor = new EvaluatorVisitor();
        visitor.visit(tree);
    }
}
