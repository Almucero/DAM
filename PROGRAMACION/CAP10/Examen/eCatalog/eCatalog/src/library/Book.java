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
        return title;
    }
    @Override
    public String getAuthor() {
        return author;
    }
    @Override
    public String getIsbn() {
        return isbn;
    }
    @Override
    public int getPublicationYear() {
        return publicationYear;
    }

    public Book(String title, String author, String isbn, int publicationYear) throws IllegalArgumentException {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        if (this.publicationYear==null||this.title==null||this.author==null||this.isbn==null) {
            throw new IllegalArgumentException("Ningún campo puede ser null");
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
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', isbn='%s', publicationYear=%d}", 
        this.title, this.author, this.isbn, this.publicationYear);
    }
} 
/*Lo que DE VERDAD hay que hacer: 
1. Implementar la clase `Book` con: 
 
●  El constructor debe verificar que ningún parámetro sea 
null y lanzar IllegalArgumentException con el mensaje 
"Ningún campo puede ser null" si alguno lo es 
●  `equals()` debe comparar solo el ISBN de los libros, 
ignorando el resto de atributos 
●  `hashCode()` debe devolver el hash del ISBN para mantener 
consistencia con equals(). ¡PISTA SÚPER SECRETA! 🤫 
return isbn.hashCode(); Si la fastidias con esto, te 
mandamos directamente a programar en COBOL con una 
máquina de escribir... ¡y sin café! ☠ 
●  `toString()` debe devolver una representación en String 
con todos los atributos del libro Ejemplo: "Book{title='Don Quijote', author='Cervantes', 
isbn='123', publicationYear=1605}" 
●  Implementar la interfaz `IBook` (¡no la toques, solo 
impleméntala!) 
2. Pruebas en `Fase1.java`: 
●  Crear libros y verificar que sus datos son correctos 
●  Comprobar que dos libros con mismo ISBN son iguales 
●  Intentar crear libros con null y ver que explota 
(controladamente) */