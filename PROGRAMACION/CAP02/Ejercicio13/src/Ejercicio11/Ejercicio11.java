package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuación deberá introducir una hora del día, primero introducirá la hora y luego los minutos.");
        System.out.print("Hora: ");
        int Hora = Integer.parseInt(scanner.nextLine());
        if (Hora >= 25 || Hora <= 0) {
            System.out.println("Introduzca un valor válido");
        }
        else {
            System.out.print("Minuto: ");
            int Minutos = Integer.parseInt(scanner.nextLine());
            if (Minutos >= 61 || Minutos <= -1) {
                System.out.println("Introduzca un valor válido");
            }
            else {
                //Segundos del día = 86400
                int HoraConvertida = Hora * 60 * 60;
                int MinutosConvertidos = Minutos * 60;
                int SegundosRestantes = ((86400) - (HoraConvertida + MinutosConvertidos));
                System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", Hora, Minutos, SegundosRestantes);
            }
        }
        scanner.close();
    }
}