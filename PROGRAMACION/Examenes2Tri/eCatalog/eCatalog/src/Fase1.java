import library.Book;

/**
 * Clase de prueba para la Fase 1: Implementación de la clase Book
 * Puntuación total de la fase: 20 puntos
 */
public class Fase1 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS FASE 1: Clase Book ===\n");
        boolean allTestsPassed = true;
        int totalPoints = 0;
        
        // Prueba 1: Getters (5 puntos)
        System.out.println("Prueba 1: Verificación de getters (5 puntos)");
        Book book1 = new Book("Don Quijote", "Cervantes", "123", 1605);
        boolean gettersOk = true;
        gettersOk &= book1.getTitle().equals("Don Quijote");
        gettersOk &= book1.getAuthor().equals("Cervantes");
        gettersOk &= book1.getIsbn().equals("123");
        gettersOk &= book1.getPublicationYear() == 1605;
        System.out.println("✓ Getters implementados correctamente: " + (gettersOk ? "SÍ (5 puntos)" : "NO (0 puntos)"));
        allTestsPassed &= gettersOk;
        if (gettersOk) totalPoints += 5;

        // Prueba 2: equals() y hashCode() (10 puntos)
        System.out.println("\nPrueba 2: Verificación de equals() y hashCode() (10 puntos)");
        Book book2 = new Book("Don Quijote 2", "Cervantes", "123", 1615);
        Book book3 = new Book("Otro libro", "Otro autor", "456", 2000);
        
        boolean equalsOk = true;
        equalsOk &= book1.equals(book2);  // Mismo ISBN
        equalsOk &= !book1.equals(book3); // Distinto ISBN
        equalsOk &= book1.hashCode() == book2.hashCode(); // Mismo hash para mismo ISBN
        System.out.println("✓ equals() basado en ISBN: " + (equalsOk ? "SÍ (10 puntos)" : "NO (0 puntos)"));
        allTestsPassed &= equalsOk;
        if (equalsOk) totalPoints += 10;

        // Prueba 3: toString() (5 puntos)
        System.out.println("\nPrueba 3: Verificación de toString() (5 puntos)");
        String str = book1.toString();
        boolean toStringOk = str.contains("Don Quijote") && 
                           str.contains("Cervantes") && 
                           str.contains("123") && 
                           str.contains("1605");
        System.out.println("✓ toString() incluye todos los campos: " + (toStringOk ? "SÍ (5 puntos)" : "NO (0 puntos)"));
        allTestsPassed &= toStringOk;
        if (toStringOk) totalPoints += 5;

        // Resultado final
        System.out.println("\n=== RESULTADO FASE 1 ===");
        System.out.println(allTestsPassed ? 
            "✅ Todos los requisitos implementados correctamente" : 
            "❌ Hay requisitos no implementados correctamente");
        System.out.println("Puntuación obtenida: " + totalPoints + "/20 puntos");
    }
} 