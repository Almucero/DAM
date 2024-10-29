package Ejercicio1.Rectangulo;

public class Rectangulo {
    private double ancho;
    private double alto;

    //Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //Setter y Getters
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    //Métodos
    public double CalcularArea() {
        return this.ancho*this.alto;
    }

    public double CalcularPerimetro() {
        return (2*this.ancho)+(2*this.alto);
    }

    public void mostrardimensiones() {
        System.out.printf("Las dimensiones del rectángulo son: %n");
        System.out.printf("Ancho: %.1fcm%n",this.ancho);
        System.out.printf("Altura: %.1fcm%n",this.alto);
        System.out.printf("Área: %.1fcm^2%n",CalcularArea());
        System.out.printf("Perímetro: %.1fcm^2%n",CalcularPerimetro());
    }
}
