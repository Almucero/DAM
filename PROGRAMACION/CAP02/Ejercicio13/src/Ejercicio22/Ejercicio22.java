package Ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes):");
        try {
            //Minutos que tiene un día = 1440minutos
            //Minutos que tiene el Viernes = 900
            //Minutos que tiene la semana hasta le Viernes a las 15:00 = 6660minutos
            String Dia = scanner.nextLine();
            if (Dia.equalsIgnoreCase("Lunes")) {
                int MinutosRestantesDia = 6660;
                System.out.println("A continuación introduzca la hora (hora y minutos)");
                int Hora = Integer.parseInt(scanner.nextLine());
                if (Hora<0 || Hora>=24) {
                    System.out.println("Por favor, introduzca un valor válido");
                }
                else {
                    int Minutos = Integer.parseInt(scanner.nextLine());
                    if (Minutos<0 || Minutos>=60) {
                        System.out.println("Por favor, introduzca un valor válido");
                    }
                    else {
                        int HoraMinutos = Hora*60;
                        int MinutosRestantesTotal = (MinutosRestantesDia-HoraMinutos-Minutos);
                        System.out.printf("Desde el Lunes a las %02d:%02d hasta el Viernes a las 15:00 quedan %d minutos", Hora, Minutos, MinutosRestantesTotal);
                    }
                }
            }
            else if (Dia.equalsIgnoreCase("Martes")) {
                int MinutosRestantesDia = 5220;
                System.out.println("A continuación introduzca la hora (hora y minutos)");
                int Hora = Integer.parseInt(scanner.nextLine());
                if (Hora<0 || Hora>=24) {
                    System.out.println("Por favor, introduzca un valor válido");
                }
                else {
                    int Minutos = Integer.parseInt(scanner.nextLine());
                    if (Minutos<0 || Minutos>=60) {
                        System.out.println("Por favor, introduzca un valor válido");
                    }
                    else {
                        int HoraMinutos = Hora*60;
                        int MinutosRestantesTotal = (MinutosRestantesDia-HoraMinutos-Minutos);
                        System.out.printf("Desde el Lunes a las %02d:%02d hasta el Viernes a las 15:00 quedan %d minutos", Hora, Minutos, MinutosRestantesTotal);
                    }
                }
            }
            else if (Dia.equalsIgnoreCase("Miércoles") || Dia.equalsIgnoreCase("Miercoles")) {
                int MinutosRestantesDia = 3780;
                System.out.println("A continuación introduzca la hora (hora y minutos)");
                int Hora = Integer.parseInt(scanner.nextLine());
                if (Hora<0 || Hora>=24) {
                    System.out.println("Por favor, introduzca un valor válido");
                }
                else {
                    int Minutos = Integer.parseInt(scanner.nextLine());
                    if (Minutos<0 || Minutos>=60) {
                        System.out.println("Por favor, introduzca un valor válido");
                    }
                    else {
                        int HoraMinutos = Hora*60;
                        int MinutosRestantesTotal = (MinutosRestantesDia-HoraMinutos-Minutos);
                        System.out.printf("Desde el Lunes a las %02d:%02d hasta el Viernes a las 15:00 quedan %d minutos", Hora, Minutos, MinutosRestantesTotal);
                    }
                }
            }
            else if (Dia.equalsIgnoreCase("Jueves")) {
                int MinutosRestantesDia = 2340;
                System.out.println("A continuación introduzca la hora (hora y minutos)");
                int Hora = Integer.parseInt(scanner.nextLine());
                if (Hora<0 || Hora>=24) {
                    System.out.println("Por favor, introduzca un valor válido");
                }
                else {
                    int Minutos = Integer.parseInt(scanner.nextLine());
                    if (Minutos<0 || Minutos>=60) {
                        System.out.println("Por favor, introduzca un valor válido");
                    }
                    else {
                        int HoraMinutos = Hora*60;
                        int MinutosRestantesTotal = (MinutosRestantesDia-HoraMinutos-Minutos);
                        System.out.printf("Desde el Lunes a las %02d:%02d hasta el Viernes a las 15:00 quedan %d minutos", Hora, Minutos, MinutosRestantesTotal);
                    }
                }
            }
            else if(Dia.equalsIgnoreCase("Viernes")) {
                int MinutosRestantesDia = 900;
                System.out.println("A continuación introduzca la hora (hora y minutos)");
                int Hora = Integer.parseInt(scanner.nextLine());
                if (Hora<0 || Hora>=24) {
                    System.out.println("Por favor, introduzca un valor válido");
                }
                else {
                    int Minutos = Integer.parseInt(scanner.nextLine());
                    if (Minutos<0 || Minutos>=60) {
                        System.out.println("Por favor, introduzca un valor válido");
                    }
                    else {
                        int HoraMinutos = Hora*60;
                        int MinutosRestantesTotal = (MinutosRestantesDia-HoraMinutos-Minutos);
                        System.out.printf("Desde el Viernes a las %02d:%02d hasta el Viernes a las 15:00 quedan %d minutos", Hora, Minutos, MinutosRestantesTotal);
                    }
                }
            }
            else if (Dia.equalsIgnoreCase("Sábado") || Dia.equalsIgnoreCase("Sabado")) {
                System.out.println("Ese día es Sábado, ya es fin de semana");
            }
            else if (Dia.equalsIgnoreCase("Domingo")) {
                System.out.println("Ese día es Domingo, ya es fin de semana");
            }
            else {
                System.out.println("Introduzca un día válido");
            }
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
        scanner.close();
    }
}
//Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), 
//calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana comienza el viernes a las 15:00h. 
//Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.