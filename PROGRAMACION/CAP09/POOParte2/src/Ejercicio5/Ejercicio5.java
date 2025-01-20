package Ejercicio5;

import Ejercicio5.Excepciones.ArticuloYaExisteException;
import Ejercicio5.Excepciones.EspacioInsuficienteException;

public class Ejercicio5 {
    private static Almacen almacen = new Almacen(100);

    public static void menu() {
        System.out.print("""
            \nG E S T I S I M A L
            ===================
            1. Listado
            2. Alta
            3. Baja
            4. Modificación
            5. Entrada de mercancía
            6. Salida de mercancía
            7. Salir
            """);
        System.out.print("Introduzca una opción: ");
    }
    public static void crear() {
        System.out.println("Por favor, introduzca los datos del artículo.");
        System.out.print("Descripción: ");
        String descripcion = System.console().readLine();
        System.out.print("Precio de compra: ");
        double precioCompra = Integer.parseInt(System.console().readLine());
        System.out.print("Precio de venta: ");
        double precioVenta = Integer.parseInt(System.console().readLine());
        Articulo a = new Articulo(descripcion, precioCompra, precioVenta);
        try {
            almacen.nuevoArticulo(a);
        } catch (ArticuloYaExisteException | EspacioInsuficienteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        int opcion=-1;
        int opcion2=-1;

        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    Sys
                    break;
                case 2:
                    crear();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    break;
            }
        } while (opcion!=7);
    }
}