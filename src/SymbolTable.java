import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Object> symbols = new HashMap<>();

    public void put(String name, Object value) {
        symbols.put(name, value);
    }

    public Object get(String name) {
        return symbols.get(name);
    }

    public boolean contains(String name) {
        return symbols.containsKey(name);
    }

    public String toString() {
        return symbols.toString();
    }
}
