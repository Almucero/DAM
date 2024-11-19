package Ejercicio67;

public class Ejercicio67 {
    public static void pintarPeldano(int anchura) {
        for (int i=1; i<=anchura; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduzca el número de escalones: ");
        int escalones = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de cada escalón: ");
        int alturaEscalon = Integer.parseInt(System.console().readLine());
        final int ANCHO_ESCALON=4;
        int anchoEscalon=ANCHO_ESCALON;
        for (int i=1; i<=escalones; i++) {
            for (int j=1; j<=alturaEscalon; j++) {
                pintarPeldano(anchoEscalon);
                System.out.println();
            }
            anchoEscalon+=ANCHO_ESCALON;
        }
    }
}