// Importar las clases necesarias
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import test.testLexer;
import test.testParser;
import test.testVisitor;

import java.io.File;
import java.util.Map;

import static org.antlr.v4.runtime.tree.Trees.getNodeText;

public class Main {
    public static void main(String[] args) throws Exception {
        // Nombre del archivo de entrada
        String fileName = "input.txt";

        // Crear un CharStream desde el archivo de entrada
        CharStream input = CharStreams.fromFileName(fileName);

        // Crear el lexer con el CharStream
        testLexer lexer = new testLexer(input);

        // Crear el CommonTokenStream con el lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear el parser con el CommonTokenStream
        testParser parser = new testParser(tokens);

        // Reemplazar los error listeners predeterminados con el CustomErrorListener
        parser.removeErrorListeners(); // Eliminar los error listeners predeterminados
        parser.addErrorListener(new CustomErrorListener()); // Agregar el CustomErrorListener

        // Crear el árbol de análisis
        ParseTree tree = parser.start();

        // Crear el visitor para evaluar el árbol de análisis
        EvaluatorVisitor visitor = new EvaluatorVisitor();

        // Visitar el árbol de análisis con el SymbolTableVisitor para construir la tabla de símbolos
        SymbolTableVisitor symbolTableVisitor = new SymbolTableVisitor();
        symbolTableVisitor.visit(tree);

        // Visitar el árbol de análisis con el visitor
        visitor.visit(tree);

        // Imprimir los tokens
        System.out.println();
        printTokens(tokens);

        // Imprimir la tabla de simbolos
        System.out.println("Tabla de símbolos:");
        System.out.println(symbolTableVisitor.getSymbolTable());

        // Imprimir el árbol de análisis como un árbol
        System.out.println("\nÁrbol de análisis:");
        printParseTree(tree, parser, 0);

        System.out.println("\n" + tree.toStringTree(parser));
    }

    // Método para imprimir los tokens
    public static void printTokens(CommonTokenStream tokens) {
        System.out.printf("%-20s %-20s %-20s\n", "Token", "Texto", "Posición");
        for (Token token : tokens.getTokens()) {
            String tokenName = testLexer.VOCABULARY.getDisplayName(token.getType());
            String tokenText = token.getText();
            String tokenPosition = "(" + token.getLine() + ":" + token.getCharPositionInLine() + ")";
            System.out.printf("%-20s %-20s %-20s\n", tokenName, tokenText, tokenPosition);
        }
    }

    public static void printParseTree(ParseTree tree, Parser parser, int depth) {
        String indentation = new String(new char[depth * 2]).replace('\0', ' ');
        String nodeText = getNodeText(tree, parser);

        System.out.println(indentation + nodeText);
        for (int i = 0; i < tree.getChildCount(); i++) {
            printParseTree(tree.getChild(i), parser, depth + 1);
        }
    }
    // Método auxiliar para obtener el texto del nodo del árbol de análisis
    public static String getNodeText(ParseTree node, Parser parser) {
        if (node instanceof RuleContext) {
            int ruleIndex = ((RuleContext) node).getRuleIndex();
            return parser.getRuleNames()[ruleIndex];
        } else {
            return node.toString();
        }
    }
}
// Clase CustomErrorListener que extiende BaseErrorListener para manejar errores personalizados
class CustomErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Imprimir el mensaje de error personalizado
        System.err.println("Error en la línea " + line + ":" + charPositionInLine + " - " + msg);
    }
}
