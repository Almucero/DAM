package Ejercicio12;

public class Carta {
    private String numeroCarta, paloCarta;

    public String getNumeroCarta() {
        return numeroCarta;
    }

    private static String[] numero = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private static String[] palo = {"bastos", "copas", "espadas", "oros"};

    public Carta() {
        this.numeroCarta = numero[(int)(Math.random()*10)];
        this.paloCarta = palo[(int)(Math.random()*4)];
    }

    @Override
    public String toString() {
        return String.format("%s de %s", this.numeroCarta, this.paloCarta);
    }
}