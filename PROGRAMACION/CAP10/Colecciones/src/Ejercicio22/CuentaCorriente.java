package Ejercicio22;

import java.util.ArrayList;

public class CuentaCorriente {
    private String numero = "";
    private double saldo;
    private ArrayList<String> movimientos = new ArrayList<String>();

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }

    public CuentaCorriente(double saldo) {
        this.saldo=saldo;
        for (int i=0; i<9; i++) {
            this.numero += (int)(Math.random()*10);
        }
    }
    public CuentaCorriente() {
        this.saldo=0;
        for (int i=0; i<9; i++) {
            this.numero += (int)(Math.random()*10);
        }
    }

    public void ingreso(int dinero) {
        this.saldo += dinero;
        movimientos.add("Ingreso de "+dinero+"$ Saldo: "+String.format("%.2f$", this.saldo));
    }

    public void cargo(int dinero) {
        this.saldo -= dinero;
        movimientos.add("Cargo de "+dinero+"$ Saldo: "+String.format("%.2f$", this.saldo));
    }

    public void transferencia(CuentaCorriente cuenta, int dinero) {
        this.saldo -= dinero;
        cuenta.setSaldo(cuenta.getSaldo()+dinero);
        movimientos.add("Transf. recibida de "+dinero+"$ de la cuenta "+cuenta.numero+" Saldo: "+String.format("%.2f$", this.saldo));
        cuenta.movimientos.add("Transf. emitida de "+dinero+"$ de la cuenta "+cuenta.numero+" Saldo: "+String.format("%.2f$", cuenta.saldo));
    }

    public void movimientos() {
        System.out.println("Movimientos de la cuenta "+this.numero+"\n----------------------------------");
        for (int i=0; i<movimientos.size(); i++) {
            System.out.println(movimientos.get(i));
        }
    }
}