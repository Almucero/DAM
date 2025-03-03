

public class TestRunner {
    public static void main(String[] args) {
        System.out.println(TestUtils.ANSI_YELLOW + "\n=== INICIANDO PRUEBAS DE AUTHENTICATOR ===" + TestUtils.ANSI_RESET);
        
        // Ejecutar Fase 1
        TestFase1.main(args);
        
        // Ejecutar Fase 2
        TestFase2.main(args);
        
        System.out.println(TestUtils.ANSI_YELLOW + "\n=== PRUEBAS COMPLETADAS ===" + TestUtils.ANSI_RESET);
    }
} 