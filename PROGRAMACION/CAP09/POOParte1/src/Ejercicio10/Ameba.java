package Ejercicio10;

public class Ameba {
    double peso;

    public Ameba() {
        this.peso=3;
    }
    
    public void come(Ameba a) {
        this.peso+=a.peso-1;
        a.peso=0;
    }

    public void come(double pesoComida) {
        this.peso+=pesoComida-1;
    }

    @Override
    public String toString() {
        return String.format("Soy una ameba y peso %.0f microgramos", peso);
    }
}
