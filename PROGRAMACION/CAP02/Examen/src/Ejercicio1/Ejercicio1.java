package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        try {
        System.out.println("\033[1m"+"PERIODO ORBITAL DEL PLANETA"+"\033[0m");
        System.out.println("===========================");
        System.out.print("Ingrese el radio orbital del planeta en millones de kilometros: ");
        double r = Double.parseDouble(System.console().readLine());
        double R = r/149.6;
        double T = Math.sqrt(R*R*R);
        System.out.printf("El periodo orbital del planeta es aproximadamente "+"\033[1m"+"%.3f años"+"\033[0m", T);
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca el valor adecuado");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}