package Ejercicio13;

public class Ejercicio13 {
    public static void main(String[] args) {
        while (true) {
            int aleatorio1 = (int)(Math.random()*6)+1;
            int aleatorio2 = (int)(Math.random()*6)+1;
            System.out.printf("%d %d%n", aleatorio1, aleatorio2);
            if (aleatorio1==aleatorio2) {
                break;
            }
        }
    }
}
