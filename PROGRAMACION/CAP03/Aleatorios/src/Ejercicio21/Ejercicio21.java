package Ejercicio21;

public class Ejercicio21 {
    public static String generarMonedra() {
        int aleatorio = (int)(Math.random()*8)+1;
        return switch (aleatorio) {
            case 1->"1 céntimo";
            case 2->"2 céntimos";
            case 3->"5 céntimos";
            case 4->"10 céntimos";
            case 5->"20 céntimos";
            case 6->"50 céntimos";
            case 7->"1 euro";
            case 8->"2 euros";
            default->"";
        };
    }
    public static String generarPosicion() {
        int aleatorio = (int)(Math.random()*2)+1;
        return switch (aleatorio) {
            case 1->"cara";
            case 2->"cruz";
            default->"";
        };
    }
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            System.out.printf("%s - %s%n", generarMonedra(), generarPosicion());
        }
    }
}