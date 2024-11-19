package Ejercicio57;

public class Ejercicio57 {
    public static void main(String[] args) {
        int altura=0;
        while (true) {
            try {
                while (true) {
                    try {
                        System.out.print("Introduzca la altura de la figura: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (!(altura>=1)) {
                            System.out.println("Error. La altura de la figura debe ser como mínimo 1");
                            System.out.println();
                        }
                        break;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido: "+e);
                        System.out.println();
                    }
                }
                for (int i=altura; i>0; i--) {
                    //espacios izquierda
                    for (int espacios=0; espacios<altura-i; espacios++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos=0; asteriscos<i; asteriscos++) {
                        if (i==altura || asteriscos==i-1 || asteriscos==0) {
                            System.out.print("*");
                        }
                        //espacios del medio
                        else {
                            System.out.print(" ");
                        }
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
