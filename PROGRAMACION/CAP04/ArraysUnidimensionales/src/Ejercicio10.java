public class Ejercicio10 {
    private static void rellenaArrayAleatoriamente(int[] valores, int max, int min) {
        for (int i=0; i<valores.length; i++) {
            valores[i] = (int)(Math.random()*(max-min-1))+min;
        }
    }
    private static void pintarArray(int [] valores) {
        for (int i=0; i<valores.length; i++) {
            System.out.printf("%d ", valores[i]);
        }
        System.out.println();
    }
    private static int[] ordenaValores(int[] valores) {
        int[] aux = new int[valores.length];
        int pares=0;
        int impares = valores.length-1;
        for (int i=0; i<valores.length; i++) {
            if (valores[i]%2==0) {
                aux[pares++] = valores[i];
            }
            if (valores[valores.length-1]%2!=0) {
                aux[impares--] = valores[valores.length-i-1];
            }
        }
        return aux;
    }
    public static void main(String[] args) {
        final int VALORES=20;
        int[] numeros = new int[VALORES];
        rellenaArrayAleatoriamente(numeros, 100, 0);
        System.out.println("Array Original:");
        pintarArray(numeros);
        int[] ordenados = ordenaValores(numeros);
        System.out.println("\nArray con los pares al principio:");
        pintarArray(ordenados);
    }
}