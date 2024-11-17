package Ejercicio64;

import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ancho = 6, alto = 3;
        
        System.out.println("******");
        System.out.println("*    *");
        System.out.println("******");
        
        boolean salir = false;
        
        while (!salir) {
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            System.out.print("Indique qué quiere hacer con el rectángulo: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    ancho++;
                    alto++;
                    break;
                case 2:
                    if (ancho > 2 && alto > 2) {
                        ancho--;
                        alto--;
                    } else {
                        System.out.println("El rectángulo no se puede achicar más.");
                    }
                    break;
                case 3:
                    int temp = ancho;
                    ancho = alto;
                    alto = temp;
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
            
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < alto - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < ancho - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
