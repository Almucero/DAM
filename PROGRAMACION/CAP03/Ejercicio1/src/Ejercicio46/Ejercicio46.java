package Ejercicio46;

public class Ejercicio46 {
    public static void main(String[] args) {
        boolean cerrar=false;
        boolean anchuraValida=false;
        boolean alturaValida=false;
        int anchura=0;
        int altura=0;
        while (cerrar!=true) {
            try {
                while (anchuraValida!=true) {
                    try {
                        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
                        anchura = Integer.parseInt(System.console().readLine());
                        if (anchura>=2) {
                            anchuraValida=true;
                        }
                        else {
                            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura es 2");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido para la anchura");
                        System.out.println();
                    }
                }
                while (alturaValida!=true) {
                    try {
                        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura>=2) {
                            alturaValida=true;
                        }
                        else {
                            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la altura es 2");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido para la altura");
                        System.out.println();
                    }
                }
                for (int fila=1; fila<=altura; fila++) {
                    if (fila==1 || fila==altura) {
                        for (int columna=1; columna<=anchura; columna++) {
                            System.out.print("* ");
                        }
                    }
                    else {
                        System.out.print("*");
                        for (int columna=2; columna<anchura; columna++) {
                            System.out.print("  ");
                        }
                        System.out.print(" *");
                    }
                    System.out.println();
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
