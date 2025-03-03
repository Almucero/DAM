package library;
import java.util.ArrayList;
import library.exceptions.*;

/**
 * Interfaz que define las operaciones que debe implementar una biblioteca.
 * Una biblioteca debe poder añadir y eliminar libros, buscar libros por ISBN o autor,
 * y proporcionar acceso a todos sus libros.
 */
public interface ILibrary {
    /**
     * Añade un nuevo libro a la biblioteca
     * @param book el libro a añadir
     * @throws DuplicateBookException si ya existe un libro con el mismo ISBN
     */
    void addBook(Book book) throws DuplicateBookException;

    /**
     * Elimina un libro de la biblioteca
     * @param isbn el ISBN del libro a eliminar
     * @throws BookNotFoundException si el libro no existe en la biblioteca
     */
    void removeBook(String isbn) throws BookNotFoundException;

    /**
     * Busca un libro por su ISBN
     * @param isbn el ISBN a buscar
     * @return el libro encontrado
     * @throws BookNotFoundException si no se encuentra el libro
     */
    Book findByIsbn(String isbn) throws BookNotFoundException;

    /**
     * Devuelve todos los libros escritos por un autor específico
     * @param author el nombre del autor a buscar
     * @return un ArrayList de libros de ese autor (vacío si no se encuentra ninguno)
     */
    ArrayList<Book> findByAuthor(String author);

    /**
     * Devuelve todos los libros de un año específico
     * @param year el año a buscar
     * @return un ArrayList de libros de ese año (vacío si no se encuentra ninguno)
     */
    ArrayList<Book> findByYear(int year);

    /**
     * Devuelve todos los libros de la biblioteca
     * @return un ArrayList que contiene todos los libros
     */
    ArrayList<Book> getAllBooks();
}