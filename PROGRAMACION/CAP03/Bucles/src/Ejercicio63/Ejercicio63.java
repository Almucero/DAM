package Ejercicio63;

public class Ejercicio63 {
    public static void pintaPiramide(int fila, int altura) {
        if (fila>=1) {
            //espacios de la izquierda
            for (int i=1; i<=altura-fila; i++) {
                System.out.print(" ");
            }
            //asteriscos hasta la mitad
            for (int i=1; i<=fila; i++) {
                System.out.print("*");
            }
            //asteriscos restantes
            for (int i=1; i<=fila-1; i++) {
                System.out.print("*");
            }
            //espacios de la derecha
            for (int i=1; i<=altura-fila; i++) {
                System.out.print(" ");
            }
        }
        else {
            //espacios de la izquierda
            for (int i=1; i<=2*altura-1; i++) {
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        try {
            System.out.print("Introduzca la altura de la primera pirámide: ");
            int alt1 = Integer.parseInt(System.console().readLine());
            System.out.print("Introduzca la altura de la segunda pirámide: ");
            int alt2 = Integer.parseInt(System.console().readLine());
            int diferenciaAltura = Math.abs(alt1-alt2);
            int altMAx = Math.max(alt1, alt2);
            for (int i=1; i<=altMAx; i++) {
                if (alt1>=alt2) {
                    pintaPiramide(i, alt1);
                    System.out.print("   ");
                    pintaPiramide(i-diferenciaAltura, alt2);
                }
                else {
                    pintaPiramide(i-diferenciaAltura, alt1);
                    System.out.print("   ");
                    pintaPiramide(i, alt2);
                }
                System.out.println();
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error. Debe introducir valores válidos: "+e);
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: "+e);
        }
    }
}