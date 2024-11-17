package Ejercicio40;

public class Ejercicio40 {
    public static void piramideHueca(int altura) {
        for (int fila=1; fila<=altura; fila++) {
            for (int espacios=1; espacios<=(altura-fila); espacios++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int espacios=1; espacios<=(2*fila-3); espacios++) {
                System.out.print(" ");
            }
            if (fila>1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void piramideHuecaInvertida(int altura) {
        for (int fila=(altura-1); fila>=1; fila--) {
            for (int espacios=1; espacios<=(altura-fila); espacios++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int espacios=1; espacios<=(2*fila-3); espacios++) {
                System.out.print(" ");
            }
            if (fila>1) {
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
                        System.out.print("Por favor, introduzca la altura del rombo: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura>=3 || altura%2!=0) {
                            altura = (altura+1)/2;
                            alturaValida=true;
                        }
                        else {
                            System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.err.println("Error. Debe introducir un valor válido para la altura");
                        System.out.println();
                    }
                }
                piramideHueca(altura);
                piramideHuecaInvertida(altura);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}