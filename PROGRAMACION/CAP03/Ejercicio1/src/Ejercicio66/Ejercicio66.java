package Ejercicio66;

import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca la altura de la figura: ");
        int altura = scanner.nextInt();
        
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
            return;
        }
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int j = 0; j < (2 * (altura - i - 1) - 1); j++) {
                System.out.print(" ");
            }
            if (i != altura - 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
