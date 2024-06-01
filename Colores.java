import java.util.HashMap;

public class Colores {
    HashMap <String, String> valores = new HashMap<>();

    void addColores() {
        valores.put("ROJO", "\033[91m");
        valores.put("VERDE", "\033[92m");
        valores.put("DEFAULT", "\033[0m");
    }
}