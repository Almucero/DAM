package Ejercicio12;

public class Revista extends Publicacion {
    private int numero;

    public Revista(String ISBN, String titulo, int anioPublicacion, int numero) {
        super(ISBN, titulo, anioPublicacion);
        this.numero=numero;
    }
}