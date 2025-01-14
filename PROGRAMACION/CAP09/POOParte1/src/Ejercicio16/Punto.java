package Ejercicio16;

public class Punto {
    private double coordenadaX;
    private double coordenadaY;

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX=coordenadaX;
        this.coordenadaY=coordenadaY;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", coordenadaX, coordenadaY);
    }
}