package library;
import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.util.ArrayList;
import java.util.HashMap;
import library.exceptions.*;

/**
 * Implementación de una biblioteca que gestiona una colección de libros.
 * Utiliza un catálogo para almacenar los libros y un HashMap para acceso rápido por autor.
 * //hashmap (autor, libro)
 */
public class Library implements ILibrary {
    private HashMap<String, ArrayList<Book>> accesoAutor;
    private HashMap<Integer, ArrayList<Book>> accesoAnio;
    private HashMap<String, ArrayList<Book>> accesoIsbn;
    private Catalog<Book> catalog;

    public Library() {
        accesoAutor = new HashMap<String, ArrayList<Book>>();
        accesoAnio = new HashMap<Integer, ArrayList<Book>>();
        catalog = new Catalog<Book>();
    }

    @Override
    public void addBook(Book book) throws DuplicateBookException {
        if (catalog.getAllItems().contains(book)) {
            throw new DuplicateBookException(book.getIsbn());
        }
        else {
            catalog.addItem(book);
            ArrayList<Book> libroSucio = new ArrayList<Book>();
            accesoAutor.put(book.getAuthor(), libroSucio);
            accesoAnio.put(book.getPublicationYear(), libroSucio);
            //accesoIsbn.put(book.getIsbn(), libroSucio);
        }
    }

    @Override
    public void removeBook(String isbn) throws BookNotFoundException {
        Book libro = findByIsbn(isbn);
        if (libro!=null) {
            catalog.removeItem(libro);
        } else {
            throw new BookNotFoundException("No se encontró ningún libro con el ISBN: "+isbn);
        }
    }

    @Override
    public Book findByIsbn(String isbn) throws BookNotFoundException {
        for (Book libro:catalog.getAllItems()) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        throw new BookNotFoundException("No se encontró ningún libro con el ISBN: "+isbn);
    }

    @Override
    public ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> libros = new ArrayList<>();
        for (int i=0; i<libros.size(); i++) {
            libros.
        }
        throw new BookNotFoundException("No se encontró ningún libro del autor: "+author);
    }

    @Override
    public ArrayList<Book> findByYear(int year) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByYear'");
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> libros = new ArrayList<Book>();
        for (int i=0; i<libros.size(); i++) {
            libros.add(catalog.getAllItems().get(i));
        }
        return libros;
    }
}
/*El plan maestro (o cómo convertirte en el señor de los libros): 
 
1. Implementar `Library` usando tu flamante `Catalog<Book>` (¡ese 
que te costó tres noches de insomnio!). 
2. Debes implementar estos métodos explosivos (literalmente): 
 
○  `addBook`: Si el ISBN ya existe → ¡BOOM! 💥 
(DuplicateBookException) ¡Como cuando intentas registrarte en una web y te dicen 
que tu email ya existe! 😤 
○  `removeBook`: Si el ISBN no existe → ¡BOOM! 💥 
(BookNotFoundException)  Es como buscar las llaves que JURASTE que dejaste en la 
mesa... ¡pero no están! 🔑 
○  `findByIsbn`: Si no encuentra el libro → ¡BOOM! 💥 
(BookNotFoundException) Similar a cuando buscas ese calcetín perdido... ¡sabes 
que existe pero no aparece! 🧦  
¡MEGA PISTA! 🌟 Si tu código explota más que una fábrica de 
fuegos artificiales, vas por buen camino.  
¡Pero que explote con ESTILO y las excepciones correctas!  
 
1. Implementación de Library (20 puntos): 
○  addBook con gestión de duplicados (7 puntos) 
○  removeBook con validación (7 puntos) 
○  findByIsbn con excepciones (6 puntos) 
2. Pruebas Fase3.java pasan correctamente (5 puntos) */

