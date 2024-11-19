package Ejercicio8;

public class Ejercicio8 {
    public static void main(String args[]) throws Exception {
        System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
        try {
            int num = Integer.parseInt(System.console().readLine());
            for (int i=0;i<=10;i++) {
                System.out.printf("%d x %2d = %3d%n", num, i, num*i);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error. Debe de introducir un número (no decimal)");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
