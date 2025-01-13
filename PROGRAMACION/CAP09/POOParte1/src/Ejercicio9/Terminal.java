package Ejercicio9;

public class Terminal {
    private int duracion;
    private String numero;

    public Terminal(String numero) {
        this.numero=numero;
        this.duracion=0;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return String.format("No %s - %ds de conversación", numero, duracion);
    }

    public void llama(Terminal t, int segundos) {
        this.duracion+=segundos;
        t.duracion+=segundos;
    }
}