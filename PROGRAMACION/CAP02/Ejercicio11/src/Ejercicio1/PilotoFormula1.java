package Ejercicio1;

public class PilotoFormula1{
    private String nombre;
    private String equipo;
    private int dorsal;
    private String modeloCoche;

    //constructor
    public PilotoFormula1(String nombre, String equipo, int dorsal, String modeloCoche) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.dorsal = dorsal;
        this.modeloCoche = modeloCoche;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }
    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }
}