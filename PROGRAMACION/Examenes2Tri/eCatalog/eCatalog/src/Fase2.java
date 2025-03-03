import library.*;
import java.util.ArrayList;

/**
 * Clase de prueba para la Fase 2: Implementación del Catálogo Genérico
 * Puntuación total de la fase: 30 puntos
 */
public class Fase2 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS FASE 2: Clase Catalog ===\n");
        boolean allTestsPassed = true;
        int totalPoints = 0;
        
        // Prueba 1: Catálogo de Strings (10 puntos)
        System.out.println("Prueba 1: Catálogo de Strings (10 puntos)");
        Catalog<String> stringCatalog = new Catalog<>();
        stringCatalog.addItem("Uno");
        stringCatalog.addItem("Dos");
        stringCatalog.addItem("Uno"); // Duplicado
        
        boolean stringTest = true;
        ArrayList<String> stringItems = stringCatalog.getAllItems();
        stringTest &= stringItems.size() == 2;
        stringTest &= stringItems.contains("Uno");
        stringTest &= stringItems.contains("Dos");
        System.out.println("✓ Manejo básico de elementos: " + (stringTest ? "SÍ (10 puntos)" : "NO (0 puntos)"));
        allTestsPassed &= stringTest;
        if (stringTest) totalPoints += 10;

        // Prueba 2: Eliminación (10 puntos)
        System.out.println("\nPrueba 2: Eliminación de elementos (10 puntos)");
        stringCatalog.removeItem("Uno");
        ArrayList<String> afterRemoval = stringCatalog.getAllItems();
        boolean removeTest = afterRemoval.size() == 1 && 
                           !afterRemoval.contains("Uno");
        System.out.println("✓ Eliminación correcta: " + (removeTest ? "SÍ (10 puntos)" : "NO (0 puntos)"));
        allTestsPassed &= removeTest;
        if (removeTest) totalPoints += 10;

        // Prueba 3: Catálogo de libros (10 puntos)
        System.out.println("\nPrueba 3: Catálogo de libros (10 puntos)");
        Catalog<Book> bookCatalog = new Catalog<>();
        Book book1 = new Book("Libro 1", "Autor 1", "111", 2000);
        Book book2 = new Book("Libro 2", "Autor 2", "222", 2001);
        Book book3 = new Book("Libro 3", "Autor 1", "333", 2002);

        bookCatalog.addItem(book1);
        bookCatalog.addItem(book2);
        bookCatalog.addItem(book3);
        
        boolean bookTest = true;
        ArrayList<Book> bookItems = bookCatalog.getAllItems();
        bookTest &= bookItems.size() == 3;
        bookTest &= bookItems.contains(book1);
        bookTest &= bookItems.contains(book2);
        bookTest &= bookItems.contains(book3);
        System.out.println("✓ Manejo de libros: " + (bookTest ? "SÍ (10 puntos)" : "NO (0 puntos)"));
        allTestsPassed &= bookTest;
        if (bookTest) totalPoints += 10;

        // Resultado final
        System.out.println("\n=== RESULTADO FASE 2 ===");
        System.out.println(allTestsPassed ? 
            "✅ Todos los requisitos implementados correctamente" : 
            "❌ Hay requisitos no implementados correctamente");
        System.out.println("Puntuación obtenida: " + totalPoints + "/30 puntos");
    }
} 