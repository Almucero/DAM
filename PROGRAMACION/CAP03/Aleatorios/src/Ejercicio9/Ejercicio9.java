package Ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
        int veces=0;
        while (true) {
            int aleatorio = (int)(Math.random()*100)+1;
            if (aleatorio%2==0) {
                System.out.printf("%d ", aleatorio);
                veces++;
                if (aleatorio==24) {
                    break;
                }
            }
        }
        System.out.printf("%nSe han generado %d números", veces);
    }
}