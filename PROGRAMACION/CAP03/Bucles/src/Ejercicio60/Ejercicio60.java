package Ejercicio60;

public class Ejercicio60 {
    public static void main(String[] args) {
        int altura=0;
        while (true) {
            try {
                while (true) {
                    try {
                        System.out.print("Introduzca la altura de los calcetines: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (!(altura<4)) {
                            break;
                        }
                        else {
                            System.out.println("La altura mínima de los calcetines es 4");
                            System.out.println();
                        }
                        break;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido: "+e);
                        System.out.println();
                    }
                }
                for (int i=0; i<altura-2; i++) {
                    System.out.println("***    ***   ");
                }
                System.out.println("****** ******");
                System.out.println("****** ******");
                break;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                break;
            }
        }
    }
}