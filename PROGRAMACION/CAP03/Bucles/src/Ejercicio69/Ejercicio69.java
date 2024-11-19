package Ejercicio69;

public class Ejercicio69 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i=1; i<=altura; i++) {
            //espacios de la izquierda
            for (int j=1; j<=altura-i; j++) {
                System.out.print(" ");
            }
            //astersicos de la izquierda
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //mitad
            if (i%2==0) {
                System.out.print("    ");
            }
            else {
                System.out.print("****");
            }
            //astersicos de la derecha
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}