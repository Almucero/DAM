package library.exceptions;

/**
 * Se lanza cuando se intenta añadir un libro que ya existe en la biblioteca
 */
public class DuplicateBookException extends LibraryException {
    public DuplicateBookException(String isbn) {
        super("Ya existe un libro con el ISBN: " + isbn);
    }
} 