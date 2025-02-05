import library.*;
import library.exceptions.*;
import java.util.ArrayList;

/**
 * Clase de prueba para la Fase 4: Implementación de Búsquedas
 * Puntuación total de la fase: 25 puntos
 */
public class Fase4 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS FASE 4: Clase Library (Búsquedas) ===\n");
        boolean allTestsPassed = true;
        int totalPoints = 0;

        Library library = new Library();
        try {
            // Preparar datos de prueba
            library.addBook(new Book("Libro 1", "Autor 1", "111", 2000));
            library.addBook(new Book("Libro 2", "Autor 2", "222", 2001));
            library.addBook(new Book("Libro 3", "Autor 1", "333", 2002));
            library.addBook(new Book("Libro 4", "Autor 3", "444", 2003));

            // Prueba 1: Búsqueda por ISBN exitosa (4 puntos)
            System.out.println("Prueba 1: Búsqueda por ISBN (4 puntos)");
            boolean isbnFound = false;
            try {
                Book foundBook = library.findByIsbn("222");
                isbnFound = foundBook != null && foundBook.getIsbn().equals("222");
            } catch (BookNotFoundException e) {
                isbnFound = false;
            }
            System.out.println("✓ Búsqueda por ISBN exitosa: " + (isbnFound ? "SÍ (4 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= isbnFound;
            if (isbnFound) totalPoints += 4;

            // Prueba 2: Búsqueda por ISBN inexistente (3 puntos)
            System.out.println("\nPrueba 2: ISBN no encontrado (3 puntos)");
            boolean notFoundHandled = false;
            try {
                library.findByIsbn("999");
            } catch (BookNotFoundException e) {
                notFoundHandled = true;
            }
            System.out.println("✓ Manejo de ISBN no encontrado: " + (notFoundHandled ? "SÍ (3 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= notFoundHandled;
            if (notFoundHandled) totalPoints += 3;

            // Prueba 3: Búsqueda por autor (4 puntos)
            System.out.println("\nPrueba 3: Búsqueda por autor (4 puntos)");
            ArrayList<Book> authorBooks = library.findByAuthor("Autor 1");
            boolean authorSearch = authorBooks.size() == 2 &&
                                 authorBooks.stream().allMatch(b -> b.getAuthor().equals("Autor 1"));
            System.out.println("✓ Búsqueda por autor correcta: " + (authorSearch ? "SÍ (4 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= authorSearch;
            if (authorSearch) totalPoints += 4;

            // Prueba 4: Autor inexistente (4 puntos)
            System.out.println("\nPrueba 4: Autor inexistente (4 puntos)");
            ArrayList<Book> noBooks = library.findByAuthor("Autor Inexistente");
            boolean emptyResult = noBooks.isEmpty();
            System.out.println("✓ Lista vacía para autor inexistente: " + (emptyResult ? "SÍ (4 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= emptyResult;
            if (emptyResult) totalPoints += 4;

            // Prueba 5: Consistencia del mapa de autores (10 puntos)
            System.out.println("\nPrueba 5: Consistencia tras eliminar (10 puntos)");
            Book bookToRemove = library.findByIsbn("333");
            library.removeBook(bookToRemove.getIsbn());
            ArrayList<Book> remainingBooks = library.findByAuthor("Autor 1");
            boolean consistency = remainingBooks.size() == 1 &&
                                !remainingBooks.contains(bookToRemove);
            System.out.println("✓ Consistencia del mapa de autores: " + (consistency ? "SÍ (10 puntos)" : "NO (0 puntos)"));
            allTestsPassed &= consistency;
            if (consistency) totalPoints += 10;

        } catch (LibraryException e) {
            System.out.println("Error inesperado: " + e.getMessage());
            allTestsPassed = false;
        }

        // Resultado final
        System.out.println("\n=== RESULTADO FASE 4 ===");
        System.out.println(allTestsPassed ? 
            "✅ Todos los requisitos implementados correctamente" : 
            "❌ Hay requisitos no implementados correctamente");
        System.out.println("Puntuación obtenida: " + totalPoints + "/25 puntos");
    }
} 