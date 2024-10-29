package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("VUELTAS DE LA TIERRA");
        System.out.println("====================");
        System.out.print("Introduzca un número de años: ");
        long anios = scanner.nextLong();
        long diasAnio = 365;
        long vueltas = anios * diasAnio;
        System.out.println("La tierra habrá dado un total de "+vueltas+" vueltas en "+anios+" años");
        scanner.close();
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperaso");
        }
    }
}