package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int suma=0;
        int valores=0;
        int maximo=Integer.MIN_VALUE;
        int minimo=Integer.MAX_VALUE;
        for (int i=1; i<=50; i++) {
            int valor = (int)(Math.random()*50)+1;
            suma +=valor;
            valores++;
            if (valor<minimo) {
                minimo=valor;
            }
            if (valor>maximo) {
                maximo=valor;
            }
            System.out.print(valor+" ");
        }
        System.out.println();
        System.out.printf("Mínimo: %d%n", minimo);
        System.out.printf("Máximo: %d%n", minimo);
        System.out.printf("Media: %d%n", suma/valores);
    }
}
