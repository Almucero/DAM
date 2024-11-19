package Ejercicio31;

public class Ejercicio31 {
    public static void imprimirL(int altura) {
        for (int fila=1; fila<=altura; fila++) {
            if (fila!=altura) {
                System.out.println("* ");
            }
            else {
                for (int base=1; base<=(altura/2)+1; base++) {
                    System.out.print("* ");
                }
            }
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
                        System.out.print("Introduzca la altura de la L: ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura>=2) {
                            alturaValida=true;
                        }
                        else {
                            System.out.println("Error. La altura mímina de la L es 2");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                imprimirL(altura);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}
