package Ejercicio8_Profe;

public class Carta {
    private int numero;

    public Carta(int numero) {
        this.numero=numero;
    }

    public Carta(String numero, String palo) throws Exception{
        int valorNumero = switch(numero.toLowerCase()){
            case "uno"->0;
            case "dos"->1;
            case "tres"->2;
            case "cuatro"->3;
            case "cinco"->4;
            case "seis"->5;
            case "siete"->6;
            case "sota"->7;
            case "caballo"->8;
            case "rey"->9;
            default->throw new Exception("Carta inválida");
        };
        int valorPalo = switch(palo.toLowerCase()){
            case "oros"->0;
            case "copas"->1;
            case "espadas"->2;
            case "bastos"->3;
            default->throw new Exception("Carta inválida");
        };
        this.numero = valorPalo*10+valorNumero;
    }
    
    public static String getPalo(int carta){
        return switch((int)((carta-1)/10)){
            case 0->"oros";
            case 1->"copas";
            case 2->"espadas";
            case 3->"bastos";
            default->"";
        };
    }
    
    public static String getNumero(int carta){
        return switch((int)((carta-1)%10)){
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