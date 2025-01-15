package clases;

import java.awt.*;

public class Persona {
    private String nombre;
    private String apellidos;
    private float altura;
    private float peso;
    private int fechaNacimiento;
    private Color colorPelo;
    private String saludo;

    public void crecer(float cantidad) {
        altura += cantidad;
    }
    public void saludar() {
        System.out.println(saludo);
    }
    public void decir(String frase) {
        System.out.println(frase);
    }
    public void bautizar(String nuevoNombre, String nuevosApellidos) {
        nombre=nuevoNombre;
        apellidos=nuevosApellidos;
    }
    public int preguntarEdad() {
        return 0;
    }
}
