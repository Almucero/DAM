package Ejercicio53;

public class Ejercicio53 {
    public static void main(String[] args) {
        int altura=0;
        while (true) {
            try {
                while (true) {
                    try {
                        System.out.print("Introduzca la altura de la figura: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura>0) {
                            break;
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
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                break;
            }
        }
    }
}