package Ejercicio39;

public class Ejercicio39 {
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean numAceptado=false;
        int num=0;
        long numMultiplicando=1;
        while (cerrar!=true) {
            try {
                while (numAceptado!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número entero positivo: ");
                        num = Integer.parseInt(System.console().readLine());
                        if (num>=0) {
                            numAceptado=true;
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
                for (int i=1; i<=num; i++) {
                    numMultiplicando=numMultiplicando*i;
                    System.out.printf("%d! = %d%n", i, numMultiplicando);
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