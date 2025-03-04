package library;
import java.util.ArrayList;
import java.util.HashMap;
import library.exceptions.*;

/**
 * Implementación de una biblioteca que gestiona una colección de libros.
 * Utiliza un catálogo para almacenar los libros y un HashMap para acceso rápido por autor.
 */
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
public class Library implements ILibrary {
    Catalog<Book> catalogo;

    public Library() {
        this.catalogo = new Catalog<>();
    }

    @Override
    public void addBook(Book book) throws DuplicateBookException {
        for (int i=0; i<catalogo.getAllItems().size(); i++) {
            if (catalogo.getAllItems().get(i)!=null && catalogo.getAllItems().get(i).equals(book)) {
                throw new DuplicateBookException(book.getIsbn());
            }
        }
        catalogo.addItem(book);
    }

    @Override
    public void removeBook(String isbn) throws BookNotFoundException {
        for (int i=0; i<catalogo.getAllItems().size(); i++) {
            if (catalogo.getAllItems().get(i)!=null && catalogo.getAllItems().get(i).getIsbn().equals(isbn)) {
                catalogo.removeItem(catalogo.getAllItems().get(i));
                return;
            }
        }
        throw new BookNotFoundException(isbn);
    }

    @Override
    public Book findByIsbn(String isbn) throws BookNotFoundException {
        for (int i=0; i<catalogo.getAllItems().size(); i++) {
            if (catalogo.getAllItems().get(i)!=null && catalogo.getAllItems().get(i).getIsbn().equals(isbn)) {
                return catalogo.getAllItems().get(i);
            }
        }
        throw new BookNotFoundException(isbn);
    }

    @Override
    public ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> libros = new ArrayList<>();
        for (int i=0; i<catalogo.getAllItems().size(); i++) {
            if (catalogo.getAllItems().get(i)!=null && catalogo.getAllItems().get(i).getAuthor().equals(author)) {
                libros.add(catalogo.getAllItems().get(i));
            }
        }
        return libros;
    }

    @Override
    public ArrayList<Book> findByYear(int year) {
        ArrayList<Book> libros = new ArrayList<>();
        for (int i=0; i<catalogo.getAllItems().size(); i++) {
            if (catalogo.getAllItems().get(i)!=null && catalogo.getAllItems().get(i).getPublicationYear()==year) {
                libros.add(catalogo.getAllItems().get(i));
            }
        }
        return libros;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return catalogo.getAllItems();
    }

} 