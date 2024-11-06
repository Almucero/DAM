package Ejercicio27;

public class Ejercicio27 {
    public static void main(String[] args) throws Exception {
        boolean numAceptado=false;
        boolean cerrar=false;
        while (cerrar!=true) {
            try {
                int num=0;
                while (numAceptado!=true) {
                    try {
                        System.out.print("Introduzca un número entero mayor que 1: ");
                        num = Integer.parseInt(System.console().readLine());
                        if (num>1) {
                            numAceptado=true;
                        }
                        else {
                            System.out.println("Debe introducir un número entero mayor que 1");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe de introducir un número entero");
                        System.out.println();
                    }
                }
                int veces=0;
                int sumaMultiplos=0;
                for (int i=3; i<=num; i+=3) {
                    veces++;
                    sumaMultiplos = sumaMultiplos+i;
                    System.out.printf("%d ",i);
                }
                System.out.printf("Desde 1 hasta %d hay %d múltiplos de 3 y suman %d", num, veces, sumaMultiplos);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}