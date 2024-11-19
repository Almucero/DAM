package Ejercicio16;

public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        while (cerrar!=true) {
            try {
                System.out.print("Introduzca un número entero y le diré si es primo: ");
                int num = Integer.parseInt(System.console().readLine());
                int contador=2;
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
                cerrar=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un número entero");
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}
