package Ejercicio2bis;

public class Gato {
    private String nombre;
    private String color;
    private String raza;

    public Gato(String nombre, String color, String raza) {
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
    }
    public Gato() {

    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return String.format("""
        \nNombre: %s
        Color: %s
        Raza: %s
        """, nombre, color, raza);
    }
}