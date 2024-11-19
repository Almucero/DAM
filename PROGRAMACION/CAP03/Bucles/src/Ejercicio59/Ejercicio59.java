package Ejercicio59;

public class Ejercicio59 {
    public static void main(String[] args) {
        int altura=0;
        while (true) {
            try {
                while (true) {
                    try {
                        System.out.print("Por favor, introduzca la altura del árbol: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (!(altura<4)) {
                            break;
                        }
                        else {
                            System.out.println("Error. Debe introducir una altura superior o igual a 4");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir una altura válida: "+e);
                        System.out.println();
                    }
                }
                for (int i=0; i<altura-1; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                for (int i=1; i<=altura; i++) {
                    for (int espacios=1; espacios<=altura-i; espacios++) {
                        System.out.print(" ");
                    }
                    System.out.print("^");
                    for (int asteriscos=1; asteriscos<=2*i-3; asteriscos++) {
                        if (i==altura) {
                            System.out.print("^");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    if (i>1) {
                        System.out.print("^");
                    }
                    System.out.println();
                }
                for (int i=0; i<altura-1; i++) {
                    System.out.print(" ");
                }
                System.out.println("Y");
                break;  
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                break;
            }
        }
    }
}
