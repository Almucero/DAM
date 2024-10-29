package Vehiculo;

public class Vehiculo {
    private int numMatricula;
    private String marca;
    private int anioFabricacion;
    private double precioAlquiler;

    public Vehiculo(int numMatricula, String marca, int anioFabricacion, double precioAlquiler) {
        this.numMatricula = numMatricula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precioAlquiler = precioAlquiler;
    }

    public int getnumMatricula() {
        return numMatricula;
    }
    public void setnumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getanioFabricacion() {
        return anioFabricacion;
    }
    public void setfechaFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getprecioAlquiler() {
        return precioAlquiler;
    }
    public void setprecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void mostarInfo() {
        System.out.printf("Número de matricula: %d%n", this.numMatricula);
        System.out.printf("Marca del vehículo: %s%n", this.marca);
        System.out.printf("Año de fabricación: %d%n", this.anioFabricacion);
        System.out.printf("Precio de alquiler: %f%n", this.precioAlquiler);
    }
}
