package Ejercicio18;

public class Ejercicio18 {
    public static void main(String[] args) throws Exception {
        boolean num1Aceptado=false;
        boolean num2Aceptado=false;
        boolean cerrar=false;
        int num1=0;
        int num2=0;
        while (cerrar!=true) {
            try {
                while (num1Aceptado!=true) {
                    try {
                        System.out.print("Introduzca un número entero: ");
                        num1 = Integer.parseInt(System.console().readLine());
                        num1Aceptado=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor aceptado para el primer número");
                        System.out.println();
                    }
                }
                while (num2Aceptado!=true) {
                    try {
                        System.out.print("Introduzca otro número entero distinto al anterior: ");
                        num2 = Integer.parseInt(System.console().readLine());
                        if (num1==num2) {
                            System.out.println("Los número introducidos no son válidos, deben ser distintos.");
                            System.out.println();
                        }
                        else {
                            num2Aceptado=true;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor aceptado para el segundo número");
                        System.out.println();
                    }
                }
                if (num2>num1) {
                    for (int i=num1; i<=num2; i+=7) {
                        System.out.print(i+" ");
                    }
                }
                else {
                    for (int i=num2; i<=num1; i+=7) {
                        System.out.print(i+" ");
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