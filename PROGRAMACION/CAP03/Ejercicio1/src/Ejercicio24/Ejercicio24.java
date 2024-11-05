package Ejercicio24;

public class Ejercicio24 {
    public static void main(String[] args) {
        int altura=10;
        for (int fila=1; fila<=altura; fila++) {
            for (int espacios=1; espacios<=(altura-fila); espacios++) {
                System.out.print(" ");
            }
            for (int relleno=1; relleno<=(2*fila-1); relleno++) {
                int numeros=1;
                if (relleno>(2*fila-1)/2) {
                    numeros--;
                    System.out.print(numeros);
                }
                else {
                    numeros++;
                    System.out.print(numeros);
                }
            }
            System.out.println();
        }
    }
}
