package Ejercicio3;

public class Ejerciocio3 {
    public static void main(String[] args) {
        int aleatorio1 = (int)(Math.random()*4);
        int aleatorio2 = (int)(Math.random()*10);
        String palo="";
        String carta="";
        switch (aleatorio1) {
            case 0 -> palo="copas";
            case 1 -> palo="bastos";
            case 2 -> palo="espadas";
            case 3 -> palo="oros";
        };
        switch (aleatorio2) {
            case 0 -> carta="As";
            case 1 -> carta="2";
            case 2 -> carta="3";
            case 3 -> carta="4";
            case 4 -> carta="5";
            case 5 -> carta="6";
            case 6 -> carta="7";
            case 7 -> carta="Sota";
            case 8 -> carta="Caballo";
            case 9 -> carta="Rey";
        };
        System.out.printf("%s de %s", carta, palo);
    }
}
