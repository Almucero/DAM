package Ejercicio49;

public class Ejercico49 {
    public static void main(String[] args) {
        boolean esPrimo=false;
        int num=0;
        int maximo=0;
        int minimo=0;
        int suma=0;
        int noPrimos=0;
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        while (!esPrimo) {
            try {
                num = Integer.parseInt(System.console().readLine());
                if (num>=0) {
                    int contador=2;
                    while (contador<=num/2) {
                        if (num%contador!=0) {
                            esPrimo=true;
                        }
                        contador++;
                    }
                    noPrimos++;
                }
                else {
                    System.out.println("Error. Debe introducir un número entero positivo");
                }
                suma = suma+num;
                if (num>=maximo) {
                    maximo=num;
                }
                if (num<=minimo) {
                    minimo=num;
                }
                System.out.printf("Ha introducido %d números no primos%n", noPrimos);
                System.out.printf("Máximo: %d%n", maximo);
                System.out.printf("Mínimo: %d%n", minimo);
                System.out.printf("Media: %d%n", suma/noPrimos);
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                esPrimo=true;
            }
        }
    }
}
/*
 *                 int contador=2;
                boolean esPrimo=true;
                while (esPrimo&&contador<=num/2) {
                    if (num%contador==0) {
                        esPrimo=false;
                    }
                    contador++;
                }
                if (esPrimo) {
                    System.out.println("El número introducido es primo");
                }
                else {
                    System.out.println("El número introducido no es primo");
                }
 */