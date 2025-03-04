package library;
/**
 * Clase que representa un libro en la biblioteca.
 * Contiene la información básica de un libro: título, autor, ISBN y año de publicación.
 * Dos libros se consideran iguales si tienen el mismo ISBN.
 */
public class Book implements IBook {
    private String title;
    private String author;
    private String isbn;
    private Integer publicationYear;

    @Override
    public String getTitle() {
        return this.title;
    }
    @Override
    public String getAuthor() {
        return this.author;
    }
    @Override
    public String getIsbn() {
        return this.isbn;
    }
    @Override
    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Book(String title, String author, String isbn, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        if (this.title==null || this.author==null || this.isbn==null || this.publicationYear==null) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null || getClass()!=obj.getClass()) {
            return false;
        }
        Book book = (Book)obj;
        return this.isbn==book.isbn;
    }

    @Override
    public int hashCode() {
        return this.isbn.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', isbn='%s', publicationYear=%d}", 
        this.title, this.author, this.isbn, this.publicationYear);
    }
}