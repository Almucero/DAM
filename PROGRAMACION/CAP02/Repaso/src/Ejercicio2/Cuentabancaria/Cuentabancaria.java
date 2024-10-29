package Ejercicio2.Cuentabancaria;

public class Cuentabancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    //Constructor
    public Cuentabancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getters y Setters
    public String getnumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void depositar(double saldo) {
        this.saldo = this.saldo + saldo;
    }
    public void retirar(double saldo) {
        this.saldo = this.saldo - saldo;
    }
    public void consultarSaldo() {
        System.out.printf("Actualmente tiene %.2f de saldo.%n",this.saldo);
    }
    public void mostrarInformacion() {
        System.out.printf("Información de la cuenta: %n");
        System.out.println();
        System.out.printf("Número de la cuenta: %s%n",this.numeroCuenta);
        System.out.printf("Titulare de la cuenta: %s%n",this.titular);
        System.out.printf("Saldo de la ceunta: %.2f%n",this.saldo);
        System.out.println();
    }
}
