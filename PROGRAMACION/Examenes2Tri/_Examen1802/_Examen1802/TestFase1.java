import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestFase1 {
    
    public static void main(String[] args) {
        // Test obtenerNombreDeArchivo y mensaje de error (5 puntos)
        testArgumentos();
    }
    
    private static void testArgumentos() {
        // Test sin argumentos
        String[] argsVacio = {};
        String resultado = Authenticator.obtenerNombreDeArchivo(argsVacio);
        boolean passed1 = resultado != null && resultado.equals("");
        
        // Test con argumento válido
        String[] argsValido = {"users.data"};
        resultado = Authenticator.obtenerNombreDeArchivo(argsValido);
        boolean passed2 = resultado != null && resultado.equals("users.data");
        
        // Test mensaje de error
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        
        try {
            Authenticator.main(argsVacio);
        } catch (Exception e) {
            // Ignorar cualquier excepción
        }
        
        System.setOut(originalOut);
        boolean passed3 = outContent.toString().toLowerCase().contains("error");
        
        boolean passed = passed1 && passed2 && passed3;
        TestUtils.printResult("Manejo correcto de argumentos y mensajes de error", passed, 0.0);
    }
} 