package Ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        while (cerrar!=true) {
            try {
                System.out.print("Introduzca un número entero positivo: ");
                int num = Integer.parseInt(System.console().readLine());
                if (num<0) {
                    System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
                    System.out.println();
                }
                else {
                    int suma = 0;
                    for (int i = num; i < num + 100; i++) {
                        suma = suma+i;
                    }
                    System.out.println("La suma de los 100 números siguientes a "+num+" es "+suma+".");
                    cerrar=true;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor aceptado");
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}