package Ejercicio12;

public class Publicacion {
    private String ISBN;
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String ISBN, String titulo, int anioPublicacion) {
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s, titulo: %s, año de publicación: %d", ISBN, titulo, anioPublicacion);
    }
}