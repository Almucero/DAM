package Ejercicio47;

public class Ejercicio47 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int altura = Integer.parseInt(System.console().readLine());
        if (altura%2==0 || altura<5) {
            System.out.print("La altura introducida no es correcta.");
        }
        else {
            for (int fila=1; fila<=altura; fila++) {
                if (fila==1 || fila==altura/2 || fila==altura) {
                    System.out.print("MMMMMM");
                    System.out.println();
                }
                else {
                    System.out.print("M    M");
                    System.out.println();
                }
            }
        }
    }
}
