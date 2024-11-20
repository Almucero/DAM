package Ejercicio19;

public class Ejercicio19 {
    public static void main(String[] args) {
        final int MAXIMO=200;
        final int MINIMO=-100;
        long suma=0;
        long maximoPares=Integer.MIN_VALUE;
        long minimoImpares=Integer.MAX_VALUE;
        for (int i=1; i<=50; i++) {
            long aleatorio = (long)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
            suma = suma+aleatorio;
            if (aleatorio%2==0) {
                if (aleatorio>maximoPares) {
                    maximoPares=aleatorio;
                }
            }
            else {
                if (aleatorio<minimoImpares) {
                    minimoImpares=aleatorio;
                }
            }
            System.out.printf("%d ", aleatorio);
        }
        System.out.printf("%nMáximo de los pares: %d%n", maximoPares);
        System.out.printf("Mínimo de los impares: %d%n", minimoImpares);
        System.out.printf("Media: %d%n", suma/50);
    }
}