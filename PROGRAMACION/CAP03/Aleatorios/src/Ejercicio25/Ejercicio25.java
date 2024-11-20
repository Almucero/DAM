package Ejercicio25;

public class Ejercicio25 {
    public static boolean esPrimo(int aleatorio) {
        for (int i=2; i<=Math.sqrt(aleatorio); i++) {
            if (aleatorio%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        final int MAXIMO=200;
        final int MINIMO=10;
        for (int i=1; i<=100; i++) {
            int aleatorio = (int)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
            if (aleatorio%5==0) {
                System.out.printf("[%d] ", aleatorio);
            }
            else if (esPrimo(aleatorio)) {
                System.out.printf("#%d# ", aleatorio);
            }
            else {
                System.out.printf("%d ", aleatorio);
            }
        }
    }
}