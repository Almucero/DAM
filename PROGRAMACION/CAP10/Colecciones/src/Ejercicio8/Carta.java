package Ejercicio8;

public class Carta {
    private String numero;
    private String palo;

    public String getPalo() {
        return palo;
    }
    public String getNumero() {
        return numero;
    }

    public Carta() {
        this.numero = switch ((int)(Math.random()*10)) {
            case 0->"uno";
            case 1->"dos";
            case 2->"tres";
            case 3->"cuatro";
            case 4->"cinco";
            case 5->"seis";
            case 6->"siete";
            case 7->"sota";
            case 8->"caballo";
            case 9->"rey";
            default->"";
        };
        this.palo = switch ((int)(Math.random()*4)) {
            case 0->"oros";
            case 1->"copas";
            case 2->"espadas";
            case 3->"bastos";
            default->"";
        };
    }

    @Override
    public String toString() {
        return String.format("%s de %s", this.numero, this.palo);
    }
}