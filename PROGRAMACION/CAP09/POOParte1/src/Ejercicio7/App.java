package Ejercicio7;

public class App {
    public static void main(String[] args) {
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        int opcion=0;
        int opcion2=0;
        int entradas=0;

        do {
            System.out.print("""
                \nEXPOCOCHES MÁLAGA
                1. Mostrar número de entradas libres
                2. Vender entradas
                3. Salir
                """);
                System.out.print("Elige una opción: ");
                opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        System.out.println("En la zona principal hay "+principal.getEntradasPorVender());
                        System.out.println("En la zona de compra venta hay "+compraVenta.getEntradasPorVender());
                        System.out.println("En la zona vip hay "+vip.getEntradasPorVender());
                        break;
                    case 2:
                        System.out.print("""
                            1. Principal
                            2. Compra-venta
                            3. Vip
                            """);
                        System.out.print("Elige la zona para la que quieres comprar las entradas: ");
                        opcion2 = Integer.parseInt(System.console().readLine());
                        System.out.print("¿Cuántas entradas quieres? ");
                        entradas = Integer.parseInt(System.console().readLine());
                        switch (opcion2) {
                            case 1:
                                principal.vender(entradas);
                                break;
                            case 2:
                                compraVenta.vender(entradas);
                                break;
                            case 3:
                                vip.vender(entradas);
                                break;
                            default:
                                System.out.println("Seleccione una opción válida");
                                break;
                        }
                        break;
                }
        } while (opcion!=3);
    }
}