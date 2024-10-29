package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            System.out.println("\033[1m"+"LECTURA ILUSTRADA"+"\033[0m");
            System.out.println("=================================");
            System.out.print("Introduce código de libro: ");
            int codigo = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce precio unitario: ");
            double precioInicial = Double.parseDouble(System.console().readLine());
            System.out.print("Introduce cantidad: ");
            int cantidad = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce su descuento (%): ");
            double descuento = Double.parseDouble(System.console().readLine());
            System.out.println("Su ticket: ");
            System.out.println("LECTURA ILUSTRADA");
            System.out.println("=================================");

            double precioConCantidades = precioInicial*cantidad;
            double rebajaDescuento = (descuento/100)*precioConCantidades;
            double precioRebajado = precioConCantidades-rebajaDescuento;
            final double IVA = (double)21/100;
            double IVAaplicado = precioRebajado*IVA;
            double precioTotal = precioRebajado+IVAaplicado;

            System.out.print(codigo+"                     ");
                System.out.printf("%.2f$%n", precioInicial);
            System.out.print(cantidad+" uds."+"                     ");
                System.out.printf("%.2f$%n", precioConCantidades);
            System.out.print("-"+descuento+"%"+"                      -");
                System.out.printf("%.2f$%n", rebajaDescuento);
            System.out.print("21% IVA "+"                   +");
                System.out.printf("%.2f$%n", IVAaplicado);
            System.out.print("\033[100m"+"TOTAL"+"                      ");
                System.out.printf("%.2f$", precioTotal);
                System.out.print("\033[0m");
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca el valor adecuado");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
