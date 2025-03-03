import personal.Usuario;
import personal.Usuarios;
import java.io.File;
import java.util.ArrayList;

public class TestFase2 {
    private static double puntosTotales = 0;
    private static final double PUNTOS_POSIBLES = 100; // Ajustado a 100 puntos totales
    private static final String TEST_FILE = "test_users.data";
    
    public static void main(String[] args) {
        // Limpiar archivo de prueba
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
        
        try {
            Usuarios usuarios = new Usuarios(TEST_FILE);
            
            // Test configuración proyecto (5 puntos)
            testConfiguracion(usuarios);
            
            // Test nextId (5 puntos)
            testNextId(usuarios);
            
            // Test solicitarTodos (10 puntos)
            testSolicitarTodos(usuarios);
            
            // Test solicitarUno (10 puntos)
            testSolicitarUno(usuarios);
            
            // Test añadir (20 puntos)
            testAnadirUsuario(usuarios);
            
            // Test actualizar (25 puntos)
            testActualizar(usuarios);
            
            // Test borrar (25 puntos)
            testBorrar(usuarios);
            
        } catch (Exception e) {
            System.out.println(TestUtils.ANSI_RED + "Error en las pruebas: " + e.getMessage() + TestUtils.ANSI_RESET);
        }
        
        TestUtils.printFinalScore("Puntuación final", puntosTotales, PUNTOS_POSIBLES);
    }

    private static void testConfiguracion(Usuarios usuarios) {
        boolean passed = usuarios.getFile()!=null && usuarios.getFile().equals(TEST_FILE);
        puntosTotales += passed ? 5.0 : 0;
        TestUtils.printResult("Configuración correcta del archivo", passed, 5.0);
    }
    
    private static void testNextId(Usuarios usuarios) {
        try {
            // Añadir primer usuario (debería tener id=1)
            Usuario usuario1 = new Usuario(0, "Test", "Usuario", "test@test.com", "password");
            Usuario resultado1 = usuarios.anadir(usuario1);
            boolean passed1 = resultado1 != null && resultado1.getId() == 1;

            // Añadir segundo usuario (debería tener id=2)
            Usuario usuario2 = new Usuario(0, "Test2", "Usuario2", "test2@test.com", "password2");
            Usuario resultado2 = usuarios.anadir(usuario2);
            boolean passed2 = resultado2 != null && resultado2.getId() == 2;

            // Verificar que ambos usuarios tienen ids consecutivos
            boolean passed = passed1 && passed2;
            puntosTotales += passed ? 5.0 : 0;
            TestUtils.printResult("Inicialización y manejo correcto de nextId", passed, 5.0);
        } catch (Exception e) {
            TestUtils.printResult("Error en prueba de nextId", false, 5.0);
        }
    }

    private static void testSolicitarTodos(Usuarios usuarios) {
        ArrayList<Usuario> lista = usuarios.solicitarTodos();
        boolean passed = lista != null && lista.size() > 0;
        puntosTotales += passed ? 10.0 : 0;
        TestUtils.printResult("Obtener lista completa de usuarios", passed, 10.0);
    }

    private static void testSolicitarUno(Usuarios usuarios) {
        Usuario usuario = usuarios.solicitarUno(1);
        boolean passed1 = usuario != null && usuario.getId() == 1;
        
        usuario = usuarios.solicitarUno(999);
        boolean passed2 = usuario == null;
        
        boolean passed = passed1 && passed2;
        puntosTotales += passed ? 10.0 : 0;
        TestUtils.printResult("Solicitar usuario individual", passed, 10.0);
    }

    private static void testAnadirUsuario(Usuarios usuarios) {
        Usuario usuario = new Usuario(0, "Test3", "Usuario3", "test3@test.com", "password");
        Usuario resultado = usuarios.anadir(usuario);
        boolean passed1 = resultado != null && resultado.getId() == 3;
        
        usuario = new Usuario(0, "Test4", "Usuario4", "test3@test.com", "password");
        resultado = usuarios.anadir(usuario);
        boolean passed2 = resultado == null;
        
        boolean passed = passed1 && passed2;
        puntosTotales += passed ? 20.0 : 0;
        TestUtils.printResult("Añadir usuario y validar email duplicado", passed, 20.0);
    }

    private static void testActualizar(Usuarios usuarios) {
        Usuario usuario = usuarios.solicitarUno(1);
        if (usuario == null) {
            puntosTotales += 0;
            TestUtils.printResult("Solicitar usuario para actualizar", false, 25.0);
            return;
        }
        usuario.setNombre("Actualizado");
        Usuario actualizado = usuarios.actualizar(1, usuario);
        boolean passed1 = actualizado != null && actualizado.getNombre().equals("Actualizado");
        
        Usuario noExiste = new Usuario(999, "No", "Existe", "no@existe.com", "pass");
        actualizado = usuarios.actualizar(999, noExiste);
        boolean passed2 = actualizado == null;
        
        boolean passed = passed1 && passed2;
        puntosTotales += passed ? 25.0 : 0;
        TestUtils.printResult("Actualizar usuario y manejar inexistente", passed, 25.0);
    }

    private static void testBorrar(Usuarios usuarios) {
        Usuario borrado = usuarios.borrar(1);
        boolean passed1 = borrado != null && borrado.getId() == 1;
        
        Usuario noExiste = usuarios.solicitarUno(1);
        boolean passed2 = noExiste == null;
        
        borrado = usuarios.borrar(999);
        boolean passed3 = borrado == null;
        
        boolean passed = passed1 && passed2 && passed3;
        puntosTotales += passed ? 25.0 : 0;
        TestUtils.printResult("Borrar usuario y verificar borrado", passed, 25.0);
    }
} 