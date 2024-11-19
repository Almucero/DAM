package Ejercicio54;

public class Ejercicio54 {
    public static void main(String[] args) {
        boolean cerrar=false;
        boolean alturaAceptada=false;
        int altura=0;
        while (cerrar!=true) {
            try {
                while (alturaAceptada!=true) {
                    try {
                        System.out.print("Introduzca la altura de la figura: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura>0) {
                            alturaAceptada=true;
                        }
                        else {
                            System.out.println("Error. La altura de la figura debe ser como mínimo uno");
                            System.out.println();
                        }
                    } 
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido para la altura: "+e);
                        System.out.println();
                    }
                }
                for (int i=altura; i>0; i--) {
                    for (int asteriscos=0; asteriscos<i; asteriscos++) {
                        if (i==altura || i==1 || asteriscos==0 || asteriscos==i-1) {
                            System.out.print("*");
                        } 
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                cerrar=true;
            }
        }
    }
}