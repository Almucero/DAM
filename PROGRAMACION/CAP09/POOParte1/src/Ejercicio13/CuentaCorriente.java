package Ejercicio13;

public class CuentaCorriente {
    private String numero;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(double saldo) {
        numero="";
        this.saldo=saldo;
        for (int i=0; i<=10; i++) {
            int numAleatorio = (int)(Math.random()*10);
            this.numero+=numAleatorio;
        }
    }
    public CuentaCorriente() {
        numero="";
        for (int i=0; i<=10; i++) {
            int numAleatorio = (int)(Math.random()*10);
            this.numero+=numAleatorio;
        }
    }

    public void ingreso(double dinero) {
        saldo+=dinero;
    }

    public void cargo(double dinero) {
        saldo-=dinero;
    }

    public void transferencia(CuentaCorriente c, double dinero) {
        this.saldo-=dinero;
        c.ingreso(dinero);
    }

    @Override
    public String toString() {
        return String.format("Número de cta: %s Saldo: %.2f $", numero, saldo);
    }
}