package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int suma=0;
        int maximo=Integer.MIN_VALUE;
        int minimo=Integer.MAX_VALUE;
        for (int i=1; i<=50; i++) {
            int aleatorio = (int)(Math.random()*100)+100;
            suma = suma+aleatorio;
            if (aleatorio<minimo) {
                minimo=aleatorio;
            }
            if (aleatorio>maximo) {
                maximo=aleatorio;
            }
            System.out.printf("%d ", aleatorio);
        }
        System.out.println();
        System.out.printf("Mínimo: %d%n", minimo);
        System.out.printf("Máximo: %d%n", maximo);
        System.out.printf("Media: %d%n", suma/50);
    }
}