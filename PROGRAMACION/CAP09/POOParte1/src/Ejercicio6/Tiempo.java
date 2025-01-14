package Ejercicio6;

public class Tiempo {
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.segundos=(horas*3600)+(minutos*60)+segundos;
    }
    public Tiempo(int segundos) {
        this.segundos=segundos;
    }

    public Tiempo suma(Tiempo t) {
        return new Tiempo(this.segundos+t.segundos);
    }
    public Tiempo resta(Tiempo t) {
        return new Tiempo(this.segundos-t.segundos);
    }

    @Override
    public String toString() {
        int segundos=this.segundos;
        int horas=segundos/3600;
        segundos-=horas*3600;
        int minutos=segundos/60;
        segundos-=minutos*60;
        
        if (this.segundos<0) {
            return String.format("-(%dh %dm %ds)", (-horas), (-minutos), (-segundos));
        }
        else {
            return String.format("%dh %dm %s", horas, minutos, segundos);
        }
    }
}