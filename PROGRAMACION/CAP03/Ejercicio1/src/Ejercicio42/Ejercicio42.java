package Ejercicio42;

public class Ejercicio42 {
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean numValido=false;
        int num=0;
        while (cerrar!=true) {
            try {
                while (numValido!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número entero positivo: ");
                        num = Integer.parseInt(System.console().readLine());
                        if (num>=0) {
                            numValido=true;
                        }
                        else {
                            System.out.println("Error. Debe introducir un número entero positivo");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                for (int i=num; i<num+5; i++) {
                    int contador=2;
                    boolean esPrimo=true;
                    while (esPrimo&&contador<=i/2) {
                        if (i%contador==0) {
                            esPrimo=false;
                        }
                        contador++;
                    }
                    if (esPrimo) {
                        System.out.printf(" %d es primo%n", i);
                    }
                    else {
                        System.out.printf(" %d no es primo%n", i);
                    }
                    cerrar=true;
                }
            }   
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}