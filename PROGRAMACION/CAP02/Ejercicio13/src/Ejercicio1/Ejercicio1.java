package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String dia = scanner.nextLine();
        switch (dia) {
            case "Lunes", "lunes":
                System.out.println("Programación");
                break;
            case "Martes", "martes":
                System.out.println("IPEI");
                break;
            case "Miércoles", "Miercoles", "miercoles":
                System.out.println("Programación");
                break;
            case "Jueves", "jueves":
                System.out.println("Lenguajes de marcas");
                break;
            case "Viernes", "viernes":
                System.out.println("Lenguajes de marcas");
                break;
            default:
                System.out.println("Introduzca un día de la semana válido");
                break;
        }
        scanner.close();
    }
}