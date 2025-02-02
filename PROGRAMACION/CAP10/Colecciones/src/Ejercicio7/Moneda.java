package Ejercicio7;

public class Moneda {
    private int valor;
    private String lado;

    public int getValor() {
        return valor;
    }
    public String getLado() {
        return lado;
    }

    public Moneda() {
        this.valor = switch ((int)(Math.random()*8)) {
            case 0->1;
            case 1->2;
            case 2->5;
            case 3->10;
            case 4->20;
            case 5->50;
            case 6->100;
            case 7->200;
            default->0;
        };
        this.lado = (Math.random()>0.5) ? "Cara" : "Cruz";
    }

    @Override
    public boolean equals(Object obj) {
        Moneda nuevaMoneda  = (Moneda)obj;
        return ((nuevaMoneda.getLado()).equals(this.getLado()) || (nuevaMoneda.getValor())==this.valor);
    }

    @Override
    public String toString() {
        return String.format("%d %s - %s", (this.valor>=100) ? this.valor/100 : this.valor, (this.valor>=100) ? "euros" : "centimos", lado);
    }
}