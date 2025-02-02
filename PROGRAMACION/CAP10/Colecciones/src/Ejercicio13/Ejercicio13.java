package Ejercicio13;

import Ejercicio13.Excepciones.ArticuloNoExisteException;
import Ejercicio13.Excepciones.ArticuloYaExisteException;

public class Ejercicio13 {
    private static Almacen almacen = new Almacen();

    public static int menu() {
        System.out.print("""
            \n1. Listado
            2. Alta
            3. Baja
            4. Modificación
            5. Entrada de mercancía
            6. Salida de mercancía
            7. Salir
            """);
        System.out.print("Introduzca una opción: ");
        int opcion=0;
        try {
            opcion = Integer.parseInt(System.console().readLine());
        }
        catch (Exception e) {}
        return opcion;
    }
    public static void alta() {
        System.out.println("""
            \nNUEVO ARTÍCULO
            ==============
            Por favor, introduzca los datos del artículo.
            """);
        String descripcion="";
        double precioCompra=0, precioVenta=0;
        int stock=0;
        do {
            try {
                System.out.print("Descripcion: ");
                descripcion = System.console().readLine();
                System.out.print("Precio de compra: ");
                precioCompra = Double.parseDouble(System.console().readLine());
                System.out.print("Precio de venta: ");
                precioVenta = Double.parseDouble(System.console().readLine());
                System.out.print("Stock: ");
                stock = Integer.parseInt(System.console().readLine());
                break;
            }
            catch (Exception e) {
                System.out.println("Error al introducir los datos. Intentelo de nuevo\n");
            }
        } while (true);
        do {
            Articulo nuevArticulo = new Articulo(descripcion, precioCompra, precioVenta, stock);
            try {
                almacen.crearArticulo(nuevArticulo);
                break;
            }
            catch (ArticuloYaExisteException e) {
                System.out.println("Error. El código asignado ha ese articulo está repetido, se generará uno nuevo");
                System.console().readLine();
            }
        } while (true);
    }
    public static void baja() {
        System.out.print("""
            \nBAJA ARTÍCULO
            =============
            """);
        do {
            System.out.print("Por favor, introduzca el código del artículo: ");
            String codigo =  System.console().readLine();
            try {
                almacen.borrarArticulo(codigo);
                break;
            }
            catch (ArticuloNoExisteException e) {
                System.out.println("Error. El código introducido no corresponde con ningún artículo\n");
            }
        } while (true);
    }
    public static void entradaSalida(boolean modo) {
        System.out.printf("""
            %s DE MERCANCÍA
            ===================%s
            """, (modo) ? "ENTRADA" : "SALIDA", (modo) ? "=" : "");
        do {
            System.out.print("Por favor, introduzca el código del artículo: ");
            String codigo = System.console().readLine();
            try {
                System.out.printf("%s de mercancia del siguiente artículo:\n", (modo) ? "Entrada" : "Salida");
                int posicion = almacen.comprobarExistenciaArticulo(codigo);
                System.out.println(almacen.devolverArticuloPorPosicion(posicion));
                System.out.printf("Introduzca en número de unidades que %s", (modo) ? "entran" : "salen");
                int stock = Integer.parseInt(System.console().readLine());
                if (stock<0) {
                    System.out.println("Error. La cantidad no puede ser negativa\n");
                }
                if (modo) {
                    almacen.entradaMercancia(codigo, stock);
                    System.out.println("La mercancia ha entrado al almacén");
                    break;
                }
                else {
                    almacen.salidaMercancia(codigo, stock);
                    System.out.println("La mercancia ha salido del almacén");
                    break;
                }
            }
            catch (ArticuloNoExisteException e) {
                System.out.println("Error. El código introducido no corresponde con ningún artículo\n");
            }
        } while (true);
    }
    public static void modificar() {
        //falta hacer
    }

    public static void main(String[] args) {
        int opcion=0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println(almacen);
                    break;
                case 2:
                    alta();
                    break;
                case 3:
                    baja();
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    entradaSalida(true);
                    break;
                case 6:
                    entradaSalida(false);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Error. Introduzca una opción váilda\n");
                    break;
            }
        } while (opcion!=7);
    }
}