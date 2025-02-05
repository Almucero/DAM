package library.exceptions;

/**
 * Se lanza cuando no se encuentra un libro buscado
 */
public class BookNotFoundException extends LibraryException {
    public BookNotFoundException(String isbn) {
        super("No se encontró ningún libro con el ISBN: " + isbn);
    }
} 