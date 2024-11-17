package Ejercicio35;

public class Ejercicio35 {
    public static void parteSuperior(int altura) {
        for (int fila=altura; fila>=1; fila--) {
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
    public static void parteInferior(int altura) {
        for (int fila=2; fila<=altura; fila++) {
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
                        System.out.print("Por favor, introduzca la altura de la X: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura%2==0 || altura<3) {
                            System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
                            System.out.println();
                        }
                        else {
                            altura = (altura+1)/2;
                            alturaValida=true;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido para la altura");
                        System.out.println();
                    }
                }
                parteSuperior(altura);
                parteInferior(altura);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrío un error inesperado");
                cerrar=true;
            }
        }
    }
}