package Ejercicio2;

public class Ejercicio2 {
    public static String a() {
        String b="\033[31m";
        return b;
    }
    public static void main(String[] args) throws Exception {
        try {
        System.out.println("\033[1m"+"VOLUMEN DE UN CONO"+"\033[0m");
        System.out.println("==================");
        System.out.print("Ingrese el radio de la base del cono (cm): ");
        double r = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese la altura del cono (cm): ");
        double h = Double.parseDouble(System.console().readLine());

        final double pi = 3.14159;
        double V = pi*r*r*h/3;

        System.out.printf("El volumen del cono es: "+a()+"%.2f"+"\033[0m"+" cm3%n", V);
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca el valor adecuado");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
