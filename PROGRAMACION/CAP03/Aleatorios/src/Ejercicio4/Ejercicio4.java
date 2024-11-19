package Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        for (int i=0; i<20; i++) {
            int aleatorio = (int)(Math.random()*10)+1;
            System.out.printf("%d ", aleatorio);
        }
    }
}