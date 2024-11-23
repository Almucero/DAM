package Ejercicio28;

public class Ejercicio28 {
    public static boolean esPrimo(int aleatorio) {
        for (int i=2; i<=Math.sqrt(aleatorio); i++) {
            if (aleatorio%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int altura=0;
        final int MAXIMO=13;
        final int MINIMO=3;
        while (true) {
            altura = (int)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
            if (esPrimo(altura)) {
                break;
            }
        }
        System.out.println(altura);
        System.out.println("*    *  ****  *       **** ");
        for (int i=1; i<=altura-2; i++) {
            if (i==altura/2) {
                System.out.println("****** *    * *      ******");
            }
            else {
                System.out.println("*    * *    * *      *    *");
            }
        }
        System.out.println("*    *  ****  ****** *    *");
    }
}