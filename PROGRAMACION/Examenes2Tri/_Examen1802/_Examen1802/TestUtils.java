

public class TestUtils {
    // Códigos ANSI para colores
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    public static void printHeader(String fase, double puntosPosibles) {
        System.out.println("\n" + ANSI_YELLOW + "=== Evaluando: " + fase + " (" + puntosPosibles + " puntos) ===" + ANSI_RESET);
    }
    
    public static void printResult(String descripcion, boolean passed, double puntos) {
        String resultado = passed ? ANSI_GREEN + "✓ PASS" : ANSI_RED + "✗ FAIL";
        System.out.println(resultado + ANSI_RESET + " " + descripcion + 
                         (passed ? " (+" + puntos + " puntos)" : " (+0 puntos)"));
    }
    
    public static void printFinalScore(String fase, double puntosTotales, double puntosPosibles) {
        System.out.println(ANSI_YELLOW + "\nResultado " + fase + ": " + 
                         puntosTotales + "/" + puntosPosibles + " puntos" + ANSI_RESET);
    }
} 