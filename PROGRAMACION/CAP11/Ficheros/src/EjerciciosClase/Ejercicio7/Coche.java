package EjerciciosClase.Ejercicio7;

public class Coche {
    private String id;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precio;

    public String getId() {
        return id;
    }

    public String generarId() {
        char MaxLetra = 'Z', MinLetra = 'A', MaxNumero = '9', MinNumero = '0';
        String id = "";
        for (int i=0; i<3; i++) {
            if (Math.random()>0.5) {
                id += (char)(Math.random()*(MaxLetra-MinLetra+1)+MinLetra);
            }
            else {
                id += (char)(Math.random()*(MaxNumero-MinNumero+1)+MinNumero);
            }
        }
        return id;
    }

    public Coche(String marca, String modelo, int anioFabricacion, double precio) {
        this.id = generarId();
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        String contenido = String.format("ID: %s, Marca: %s, Modelo: %s, Fabricación: %d, Precio: %.2f", id, marca, modelo, anioFabricacion, precio);
        String separador = "=".repeat(contenido.length());
        return String.format("%s%n%s%n%s%n", separador, contenido, separador);
    }
}