package library.exceptions;

/**
 * Excepción base para todas las excepciones de la biblioteca
 */
public class LibraryException extends Exception {
    public LibraryException(String message) {
        super(message);
    }
} 