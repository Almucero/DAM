package Ejercicio2;

public class Ejerciocio2 {
    public static void main(String[] args) {
        int aleatorio1 = (int)(Math.random()*4);
        int aleatorio2 = (int)(Math.random()*12);
        String palo="";
        String carta="";
        switch (aleatorio1) {
            case 0 -> palo="picas";
            case 1 -> palo="corazones";
            case 2 -> palo="diamantes";
            case 3 -> palo="tréboles";
        };
        switch (aleatorio2) {
            case 0 -> carta="A";
            case 1 -> carta="2";
            case 2 -> carta="3";
            case 3 -> carta="4";
            case 4 -> carta="5";
            case 5 -> carta="6";
            case 6 -> carta="7";
            case 7 -> carta="8";
            case 8 -> carta="9";
            case 9 -> carta="10";
            case 10 -> carta="J";
            case 11 -> carta="Q";
            case 12 -> carta="K";
        };
        System.out.printf("%s de %s", carta, palo);
    }
}