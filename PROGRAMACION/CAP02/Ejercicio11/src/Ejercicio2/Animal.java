package Ejercicio2;

public class Animal{
    private String Persona;
    private String Perro;
    private String Gato;
    private String Caballo;
    private String Pato;

    public void animal(String Persona, String Perro, String Gato, String Caballo, String Pato) {
        this.Persona = Persona;
        this.Perro = Perro;
        this.Gato = Gato;
        this.Caballo = Caballo;
        this.Pato = Pato;
    }

    public String getPersona() {
        return Persona;
    }
    public void setPersona(String persona) {
        Persona = persona;
    }

    public String getPerro() {
        return Perro;
    }
    public void setPerro(String perro) {
        Perro = perro;
    }

    public String getGato() {
        return Gato;
    }
    public void setGato(String gato) {
        Gato = gato;
    }

    public String getCaballo() {
        return Caballo;
    }
    public void setCaballo(String caballo) {
        Caballo = caballo;
    }

    public String getPato() {
        return Pato;
    }
    public void setPato(String pato) {
        Pato = pato;
    }
}