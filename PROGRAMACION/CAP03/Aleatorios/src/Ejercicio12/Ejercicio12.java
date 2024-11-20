package Ejercicio12;

public class Ejercicio12 {
    public static void main(String[] args) {
        //altura
        for (int i=1; i<=17; i++) {
            //numeros por fila
            for (int j=1; j<=61; j++) {
                int aleatorio = (int)(Math.random()*(126-32+1))+32;
                System.out.print((char)aleatorio);
            }
            System.out.println();
        }
    }
}