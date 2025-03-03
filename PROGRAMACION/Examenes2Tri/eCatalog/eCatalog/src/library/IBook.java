package library;
/**
 * Interfaz que define las operaciones básicas que debe implementar un libro.
 * Un libro debe proporcionar acceso a su información básica: título, autor, ISBN y año de publicación.
 */
public interface IBook {
    /**
     * Devuelve el título del libro
     * @return el título como String
     */
    String getTitle();

    /**
     * Devuelve el autor del libro
     * @return el nombre del autor como String
     */
    String getAuthor();

    /**
     * Devuelve el ISBN (Número Internacional Normalizado del Libro) del libro
     * @return el ISBN como String
     */
    String getIsbn();

    /**
     * Devuelve el año en que se publicó el libro
     * @return el año de publicación como entero
     */
    int getPublicationYear();
} 