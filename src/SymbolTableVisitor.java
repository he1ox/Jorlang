import test.testBaseVisitor;
import test.testParser;

public class SymbolTableVisitor extends testBaseVisitor<Void> {
    private SymbolTable symbolTable = new SymbolTable();
    private EvaluatorVisitor evaluatorVisitor = new EvaluatorVisitor();

    @Override
    public Void visitDeclaration(testParser.DeclarationContext ctx) {
        String varName = ctx.ID().getText();
        if (ctx.expression() != null) {
            Object value = evaluatorVisitor.visit(ctx.expression());
            symbolTable.put(varName, value);
        } else {
            symbolTable.put(varName, null);
        }
        return super.visitDeclaration(ctx);
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
