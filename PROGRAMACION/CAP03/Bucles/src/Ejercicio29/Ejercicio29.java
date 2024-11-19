package Ejercicio29;

public class Ejercicio29 {
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean num1Aceptado=false;
        boolean num2Aceptado=false;
        int num1=0;
        int num2=0;
        while (cerrar!=true) {
            try {
                while (num1Aceptado!=true) {
                    try {
                        System.out.print("Introduzca un número entero positivo (relativamente grande): ");
                        num1 = Integer.parseInt(System.console().readLine());
                        if (num1>=0) {
                            num1Aceptado=true;
                        }
                        else {
                            System.out.println("Error. Debe introducir un número entero positivo");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un número entero aceptado");
                        System.out.println();
                    }
                }
                while (num2Aceptado!=true) {
                    try {
                        System.out.print("Introduzca otro número (relativamente pequeño): ");
                        num2 = Integer.parseInt(System.console().readLine());
                        num2Aceptado=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un número entero aceptado");
                        System.out.println();
                    }
                }
                for (int i=1; i<=num1; i++) {
                    if (i%num2!=0) {
                        System.out.printf("%d ", i);
                    }
                }
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}