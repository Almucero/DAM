package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        try {
        System.out.println("CALCULADORA DE TIEMPO");
        System.out.println("=====================");
        System.out.print("Introduze una cantidad de segundos: ");
        int totalSegundos = Integer.parseInt(System.console().readLine());
        if (totalSegundos<0) {
            System.out.println("Por favor, ingrese un número positivo");
        }
        else {
            int horas = totalSegundos/3600;
            int minutos = (totalSegundos%3600)/60;
            int segundos = totalSegundos%60;
            System.out.printf("%d segundos son %d horas, %d minutos y %d segundos", totalSegundos, horas, minutos, segundos);
        }
        }
        catch (Exception e) {
            System.out.println("Ocurrió un erros inesperado");
        }
    }
}
