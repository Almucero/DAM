package clases;

public class Libro {
    private String titulo;
    private String isbn;
    private String editorial;
    private String autor;
    private int numeroPaginas;
    private int fechaPublicacion;
    private boolean prestado;

    public void prestar() {
        prestado=true;
    }
    public void devolver() {
        prestado=false;
    }
}
