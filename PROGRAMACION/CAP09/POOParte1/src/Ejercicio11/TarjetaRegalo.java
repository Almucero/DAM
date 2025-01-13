package Ejercicio11;

public class TarjetaRegalo {
    private String numero;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TarjetaRegalo(double saldo) {
        this.saldo=saldo;
        this.numero="";
        for (int i=0; i<=5; i++) {
            int num = (int)(Math.random()*10);
            this.numero+=num;
        }
    }

    public void gasta(double dinero) {
        if (dinero>saldo) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f$\n", dinero);
        }
        else {
            saldo-=dinero;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        double saldoNuevo = this.getSaldo()+t.getSaldo();
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(saldoNuevo);
    }

    @Override
    public String toString() {
        return String.format("Tarjeta no %s - Saldo %.2f$", numero, saldo);
    }
}
