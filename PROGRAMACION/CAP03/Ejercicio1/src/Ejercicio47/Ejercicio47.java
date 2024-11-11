package Ejercicio47;

public class Ejercicio47 {
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean alturaValida=false;
        int altura=0;
        while (cerrar!=true) {
            try {
                while (alturaValida!=true) {
                    try {
                        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura%2==0 || altura<5) {
                            System.out.println("La altura introducida no es correcta.");
                            System.out.println();
                        }
                        else {
                            alturaValida=true;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor valido");
                        System.out.println();
                    }
                }
                for (int fila=1; fila<=altura; fila++) {
                    if (fila==1 || fila==(altura/2)+1 || fila==altura) {
                        System.out.print("MMMMMM");
                        System.out.println();
                    }
                    else {
                        System.out.print("M    M");
                        System.out.println();
                    }
                }
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}
