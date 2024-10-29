package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("TANGO MODAS");
        System.out.println("==============================");
        System.out.print("Introduce código de artículo: ");
        int CodigoArticulo = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce precio: ");
        double precioOriginal = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce unidades vendidas: ");
        int unidadesVendidas = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce descuento (%): ");
        double descuentoPorcentaje = Double.parseDouble(System.console().readLine());

        double descuento = (descuentoPorcentaje/100)*precioOriginal;
        double precioConDescuento = precioOriginal - descuento;
        double precioTotal = precioConDescuento*unidadesVendidas;

        System.out.println();
        System.out.println("Su ticket: ");
        System.out.println();
        System.out.println("TANGO MODAS");
        System.out.println("==============================");
        System.out.printf("%d      %10.2f€%n", CodigoArticulo, precioOriginal);
        System.out.printf("%d uds. %10.2f€%n", unidadesVendidas, precioOriginal*unidadesVendidas);
        System.out.printf("-%.2f%%     %10.2f€%n", descuentoPorcentaje, descuento);
        System.out.printf("%d%% IVA     %10.2f€%n", CodigoArticulo, precioOriginal);
        System.out.printf("TOTAL      %10.2f€%n", precioTotal);
    }
}
