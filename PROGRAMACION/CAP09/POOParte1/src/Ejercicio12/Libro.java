package Ejercicio12;

public class Libro extends Publicacion implements Prestable {
    private String estado="noPrestado";

    public Libro(String ISBN, String titulo, int anioPublicacion) {
        super(ISBN, titulo, anioPublicacion);
    }

    @Override
    public void presta() {
        if (this.estado.equals("prestado")) {
            System.out.println("Lo siento, ese libro ya está prestado");
        }
        else {
            this.estado="prestado";
        }
    }
    @Override
    public void devuelve() {
        this.estado="noPrestado";
    }
    @Override
    public boolean estaPrestado() {
        if (this.estado.equals("prestado")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" (%s)", (this.estado.equals("prestado")?"prestado":"no prestado"));
    }
}