package Ejercicio16;

public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(Punto p1, Punto p2) {
        this.punto1=p1;
        this.punto2=p2;
    }

    @Override
    public String toString() {
        return String.format("La línea está formada por los puntos %s y %s", punto1, punto2);
    }
}
