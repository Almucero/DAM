package Ejercicio12;


public class Publicacion {
    private String ISBN;
    private String titulo;
    private int anioPublicacion;

    protected Publicacion(String ISBN, String titulo, int anioPublicacion) {
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
    }


}
