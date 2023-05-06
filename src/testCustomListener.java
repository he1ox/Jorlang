import org.antlr.v4.runtime.misc.NotNull;
import test.testBaseListener;
import test.testParser;

public class testCustomListener extends testBaseListener {
    @Override
    public void enterPrint(@NotNull testParser.PrintContext ctx) {
        String textToPrint = ctx.STRING() != null ? ctx.STRING().getText() : ctx.expression().getText();
        if (ctx.getChild(0).getText().equals("print")) {
            System.out.print(textToPrint);
        } else {
            System.out.println(textToPrint);
        }
    }
}
