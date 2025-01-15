package clases;

public class Cuenta {
    private float saldo;

    public float depositar(float dinero) {
        saldo += dinero;
        return saldo;
    }
    public float retirar(float dinero) {
        saldo -= dinero;
        return saldo;
    }
    public float consultarSaldo() {
        return saldo;
    }
}