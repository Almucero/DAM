package Ejercicio18;

public class Ejercicio18 {
    private static String generarColores() {
        int aleatorio = (int)(Math.random()*6)+1;
        return switch (aleatorio) {
            case 1->"rojo";
            case 2->"azul";
            case 3->"verde";
            case 4->"amarillo";
            case 5->"violeta";
            case 6->"naranja";
            default->"";
        };
    }
    public static void main(String[] args) {
        String color1=generarColores();;
        String color2, color3;
        while (true) {
            color2=generarColores();
            if (!color2.equals(color1)) {
                break;
            }
        }
        while (true) {
            color3=generarColores();
            if (!color3.equals(color1) && !color3.equals(color2)) {
                break;
            }
        }
        System.out.printf("%s %s %s", color1, color2, color3);
    }
}