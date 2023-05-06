import Jorlang.*;

public class SymbolTableVisitor extends JorlangBaseVisitor<Void> {
    private SymbolTable symbolTable = new SymbolTable();
    private EvaluatorVisitor evaluatorVisitor = new EvaluatorVisitor();

    @Override
    public Void visitDeclaration(JorlangParser.DeclarationContext ctx) {
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
