import library.*;
import library.exceptions.*;

/**
 * Clase de prueba para la Fase 3: Implementación Básica de Library
 * Puntuación total de la fase: 25 puntos
 */
public class Fase3 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS FASE 3: Clase Library (Funcionalidad Básica) ===\n");
        boolean allTestsPassed = true;
        int totalPoints = 0;

        Library library = new Library();
        try {
            // Prueba 1: Añadir libros (8 puntos)
            System.out.println("Prueba 1: Añadir libros (8 puntos)");
            Book book1 = new Book("Libro 1", "Autor 1", "111", 2000);
            Book book2 = new Book("Libro 2", "Autor 2", "222", 2001);
            Book book3 = new Book("Libro 3", "Autor 1", "333", 2002);

            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);

            boolean addTest = library.getAllBooks().size() == 3 &&
                            library.getAllBooks().contains(book1) &&
                            library.getAllBooks().contains(book2) &&
                            library.getAllBooks().contains(book3);
            System.out.println("✓ Añadir libros: " + (addTest ? "SÍ (8 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= addTest;
            if (addTest) totalPoints += 8;

            // Prueba 2: Eliminar libro (7 puntos)
            System.out.println("\nPrueba 2: Eliminar libro (7 puntos)");
            library.removeBook(book2.getIsbn());
            boolean removeTest = library.getAllBooks().size() == 2 &&
                               !library.getAllBooks().contains(book2);
            System.out.println("✓ Eliminar libro: " + (removeTest ? "SÍ (7 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= removeTest;
            if (removeTest) totalPoints += 7;

            // Prueba 3: Manejo de duplicados (5 puntos)
            System.out.println("\nPrueba 3: Manejo de duplicados (5 puntos)");
            Book book4 = new Book("Otro título", "Otro autor", "111", 2003);
            boolean duplicateHandled = false;
            try {
                library.addBook(book4);
            } catch (DuplicateBookException e) {
                duplicateHandled = true;
            }
            System.out.println("✓ Detección de duplicados: " + (duplicateHandled ? "SÍ (5 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= duplicateHandled;
            if (duplicateHandled) totalPoints += 5;

            // Prueba 4: Manejo de libro no encontrado (5 puntos)
            System.out.println("\nPrueba 4: Manejo de libro no encontrado (5 puntos)");
            boolean notFoundHandled = false;
            try {
                library.removeBook("999");
            } catch (BookNotFoundException e) {
                notFoundHandled = true;
            }
            System.out.println("✓ Detección de libro no encontrado: " + (notFoundHandled ? "SÍ (5 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= notFoundHandled;
            if (notFoundHandled) totalPoints += 5;

        } catch (LibraryException e) {
            System.out.println("Error inesperado: " + e.getMessage());
            allTestsPassed = false;
        }

        // Resultado final
        System.out.println("\n=== RESULTADO FASE 3 ===");
        System.out.println(allTestsPassed ? 
            "✅ Todos los requisitos implementados correctamente" : 
            "❌ Hay requisitos no implementados correctamente");
        System.out.println("Puntuación obtenida: " + totalPoints + "/25 puntos");
    }
} 