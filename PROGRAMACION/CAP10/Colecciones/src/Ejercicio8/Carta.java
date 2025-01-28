package Ejercicio8;

public class Carta {
    private String numero;
    
    public static String getPalo(int carta) {
        return switch((int)carta/10) {
            case 1->"oros";
            case 2->"copas";
            case 3->"espadas";
            case 4->"bastos";
            default->"";
        };
    }
    
    public static String getNumero(int carta) {
        return switch((int)(carta-1)/10) {
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
    }

    @Override
    public String toString() {
        return String.format("%s de %s", getNumero(numero), getPalo(numero));
    }
}
