package Ejercicio2;

public class Ejerciocio2 {
    public static void main(String[] args) {
        int aleatorio1 = (int)(Math.random()*4);
        int aleatorio2 = (int)(Math.random()*12);
        String palo="";
        int cartaNumeral=0;
        String cartaLiteral="";
        switch (aleatorio1) {
            case 0 -> palo="picas";
            case 1 -> palo="corazones";
            case 2 -> palo="diamantes";
            case 3 -> palo="tréboles";
        };
        switch (aleatorio2) {
            case 0 -> cartaLiteral="A";
            case 1 -> cartaNumeral=2;
            case 2 -> cartaNumeral=3;
            case 3 -> cartaNumeral=4;
            case 4 -> cartaNumeral=5;
            case 5 -> cartaNumeral=6;
            case 6 -> cartaNumeral=7;
            case 7 -> cartaNumeral=8;
            case 8 -> cartaNumeral=9;
            case 9 -> cartaNumeral=10;
            case 10 -> cartaLiteral="J";
            case 11 -> cartaLiteral="Q";
            case 12 -> cartaLiteral="K";
        };
        System.out.printf("");
    }
}
