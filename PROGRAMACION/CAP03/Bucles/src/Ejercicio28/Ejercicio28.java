package Ejercicio28;

public class Ejercicio28 {
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean numAceptado=false;
        int num=0;
        long numMultiplicando=1;
        while (cerrar!=true) {
            try {
                while (numAceptado!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número entero: ");
                        num = Integer.parseInt(System.console().readLine());
                        numAceptado=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un número entero");
                        System.out.println();
                    }
                }
                for (int i=1; i<=num; i++) {
                    numMultiplicando=numMultiplicando*i;
                }
                System.out.printf("%d! = %d", num, numMultiplicando);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}