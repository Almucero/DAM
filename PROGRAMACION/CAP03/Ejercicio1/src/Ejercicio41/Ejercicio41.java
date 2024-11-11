package Ejercicio41;

public class Ejercicio41 {
    public static void main(String[] args) {
        boolean cerrar=false;
        boolean numValido=false;
        while (cerrar!=true) {
            try {
                long num=0;
                long numInicial = num;
                int pares=0;
                int impares=0;
                while (numValido!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número entero positivo: ");
                        num = Long.parseLong(System.console().readLine());
                        if (num<=0) {
                            System.out.println("Debe introducir un número entero positivo");
                            System.out.println();
                        }
                        else {
                            numValido=true;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                while (num!=0) {
                    if (num%2==0) {
                        pares++;
                    }
                    else {
                        impares++;
                    }
                    num = num/10;
                }
                cerrar=true;
                System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares.", numInicial, pares, impares);
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}
