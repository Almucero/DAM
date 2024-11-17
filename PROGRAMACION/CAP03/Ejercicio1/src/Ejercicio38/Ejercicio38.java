package Ejercicio38;

public class Ejercicio38 {
    public static void piramide(int altura) {
        for (int fila=2; fila<=altura; fila++) {
            for (int espacios=1; espacios<=(altura-fila); espacios++) {
                System.out.print(" ");
            }
            for (int asteriscos=1; asteriscos<=(2*fila-1); asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void piramideInvertida(int altura) {
        for (int fila=altura; fila>=1; fila--) {
            for (int espacios=1; espacios<=(altura-fila); espacios++) {
                System.out.print(" ");
            }
            for (int asteriscos=1; asteriscos<=(2*fila-1); asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean alturaValida=false;
        int altura=0;
        while (cerrar!=true) {
            try {
                while (alturaValida!=true) {
                    try {
                        System.out.print("Por favor, introduzca la altura del reloj de arena: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura%2==0 || altura<3) {
                            System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3.");
                            System.out.println();
                        }
                        else {
                            altura = (altura+1)/2;
                            alturaValida=true;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                piramideInvertida(altura);
                piramide(altura);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}