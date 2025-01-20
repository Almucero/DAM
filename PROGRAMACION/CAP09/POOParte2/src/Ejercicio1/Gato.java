package Ejercicio1;

public class Gato {
    private String nombre;
    private String color;
    private String raza;

    public Gato(String nombre, String color, String raza) {
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
    }
    
    @Override
    public String toString() {
        return String.format("""
        Nombre: %s
        Color: %s
        Raza: %s
        """, nombre, color, raza);
    }
}