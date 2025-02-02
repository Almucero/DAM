package Ejercicio9;

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

    public static int getValorNumero(String numero) {
        return switch (numero) {
            case "as"->0;
            case "dos"->1;
            case "tres"->2;
            case "cuatro"->3;
            case "cinco"->4;
            case "seis"->5;
            case "siete"->6;
            case "sota"->7;
            case "caballo"->8;
            case "rey"->9;
            default->-1;
        };
    }
    public static int getValorPalo(String palo) {
        return switch (palo) {
            case "bastos"->0;
            case "copas"->1;
            case "espadas"->2;
            case "oros"->3;
            default->-1;
        };
    }

    @Override
    public String toString() {
        return String.format("%s de %s", this.numero, this.palo);
    }
}