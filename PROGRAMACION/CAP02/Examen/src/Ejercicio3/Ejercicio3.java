package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        try {
        System.out.println("\033[1m"+"CALCULADORA DE TIEMPO"+"\033[0m");
        System.out.println("=====================");
        System.out.print("Introduce una cantidad de segundos: ");
        int segundosIniciales = Integer.parseInt(System.console().readLine());

        int dia = segundosIniciales/86400;
        int hora = (segundosIniciales%86400)/3600;
        int minuto = (segundosIniciales%3600)/60;
        int segundo = segundosIniciales%60;

        System.out.printf("%d segundos son "+"\033[46m"+"%d días"+"\033[0m"+", "+"\033[43m"+"%d horas"+"\033[0m"+", "+"\033[41m"+"%d minutos"+"\033[0m"+" y "+"\033[42m"+"%d segundos"+"\033[0m",segundosIniciales, dia, hora, minuto, segundo);
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca el valor adecuado");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
