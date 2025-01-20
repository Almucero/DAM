package Ejercicio2;

public class Vehiculo {
    private static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }
    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }

    public Vehiculo() {
        this.kilometrosRecorridos=0;
        vehiculosCreados++;
    }

    public void recorrer(int kilometros) {
        this.kilometrosRecorridos+=kilometros;
        Vehiculo.kilometrosTotales+=kilometros;
    }
}
