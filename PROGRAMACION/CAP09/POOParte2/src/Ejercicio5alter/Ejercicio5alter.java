package Ejercicio5alter;

import Ejercicio5alter.Excepciones.*;

public class Ejercicio5alter {
    private static Almacen almacen = new Almacen(10);
    private static void menu(){
        System.out.println("""
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
    }
    private static void listado() {
        System.out.println("""
            LISTADO
            =======
            """);
        System.out.println(almacen);
    }
    private static void alta() {
        System.out.println("""
            NUEVO ARTÍCULO
            ==============
            Por favor, introduzca los datos del artículo.
            """);
        System.out.print("Descripcion: ");
        String descripcion = System.console().readLine();
        System.out.print("Precio de compra: ");
        double precioCompra = Double.parseDouble(System.console().readLine());
        System.out.print("Precio de venta: ");
        double precioVenta = Double.parseDouble(System.console().readLine());
        System.out.print("Stock: ");
        int stock = Integer.parseInt(System.console().readLine());
        do {
            Articulo alta = new Articulo(descripcion, precioCompra, precioVenta, stock);
            try {
                almacen.nuevoArticulo(alta);
                break;
            }
            catch (ArticuloYaExisteException e) {
                System.out.println("Error. El código generado para el artículo ya existía, se generará otro código");
                System.console().readLine();
            }
            catch (EspacioInsuficienteException e) {
                System.out.println("Error. No hay suficiente espacio para añadir más artículos");
            }
        }
        while (true);
    }
    private static void baja() {
        System.out.println("""
            BAJA ARTÍCULO
            =============
            """);
        do {
            System.out.print("Por favor, introduzca el código del artículo\nCódigo: ");
            String codigo = System.console().readLine();
            try {
                almacen.bajaArticulo(codigo);
                System.out.println("Artículo eliminado");
                break;
            }
            catch (ArticuloNoExisteException e) {
                System.out.println("Error. No existe ningún artículo registrado bajo ese código\n");
            }
        }
        while (true);
    }
    private static void modificacion() {
        System.out.println("""
            MODIFICACIÓN
            ============
            """);
        do {
            System.out.print("Por favor, introduzca el código del artículo: ");
            String codigoAnterior = System.console().readLine();
            try {
                Articulo anterior = almacen.obtenerArticulo(codigoAnterior);
                System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual\n");
                System.out.println("Descripción: "+anterior.getDescripcion());
                System.out.print("Nueva descripción: ");
                String nuevaDescripcion = System.console().readLine();
                if (nuevaDescripcion.isEmpty()) {
                    nuevaDescripcion = anterior.getDescripcion();
                }
                System.out.println("Precio de compra: "+anterior.getPrecioCompra());
                System.out.print("Nuevo precio de compra: ");
                String nuevoPrecioCompra = System.console().readLine();
                double _nuevoPrecioCompra;
                if (nuevoPrecioCompra.isEmpty()) {
                    _nuevoPrecioCompra = anterior.getPrecioCompra();
                }
                else {
                    _nuevoPrecioCompra = Double.parseDouble(nuevoPrecioCompra);
                }
                System.out.println("Precio de venta: "+anterior.getPrecioVenta());
                System.out.print("Nuevo precio de venta: ");
                String nuevoPrecioVenta = System.console().readLine();
                double _nuevoPrecioVenta;
                if (nuevoPrecioVenta.isEmpty()) {
                    _nuevoPrecioVenta = anterior.getPrecioVenta();
                }
                else {
                    _nuevoPrecioVenta = Double.parseDouble(nuevoPrecioVenta);
                }
                System.out.println("Stock: "+anterior.getStock());
                System.out.print("Nuevo stock: ");
                String nuevoStock = System.console().readLine();
                int _nuevoStock;
                if (nuevoStock.isEmpty()) {
                    _nuevoStock = anterior.getStock();
                }
                else {
                    _nuevoStock = Integer.parseInt(nuevoStock);
                }
                almacen.modificaArticulo(codigoAnterior, new Articulo(nuevaDescripcion, _nuevoPrecioCompra, _nuevoPrecioVenta, _nuevoStock));
                break;
            }
            catch (ArticuloNoExisteException e) {
                System.out.println("Error. El código introducido no corresponde a ningún artículo\n");
            }
        } while (true);
    }
    private static void entrada() {
        System.out.println("""
            ENTRADA
            =======
            """);
        do {
            System.out.print("Introduzca el código del artículo cuyo stock va a aumentar: ");
            String codigo = System.console().readLine();
            System.out.print("Introduzca la cantidad a aumentar: ");
            int cantidad = Integer.parseInt(System.console().readLine());
            try {
                almacen.entrada(codigo, cantidad);
                System.out.println("Stock aumentado");
                break;
            }
            catch (StockException e) {
                System.out.println("Error. El stock es inferior a 0");
            }
            catch (ArticuloNoExisteException e) {
                System.out.println("Error. El código introducido no corresponde con ningún artículo");
            }
        }
        while (true);
    }
    private static void salida() {
        System.out.println("""
            SALIDA
            ======
            """);
        do {
            System.out.print("Introduzca el código del artículo cuyo stock va a disminuir: ");
            String codigo = System.console().readLine();
            System.out.print("Introduzca la cantidad a disminuir: ");
            int cantidad = Integer.parseInt(System.console().readLine());
            try {
                almacen.salida(codigo, cantidad);
                System.out.println("Stock aumentado");
                break;
            }
            catch (StockException e) {
                System.out.println("Error. El stock es inferior a 0");
            }
            catch (ArticuloNoExisteException e) {
                System.out.println("Error. El código introducido no corresponde con ningún artículo");
            }
        }
        while (true);
    }
    public static void main(String[] args) {
        int opcion=0;
        do {
            menu();
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    listado();
                    break;
                case 2:
                    alta();
                    break;
                case 3:
                    baja();
                    break;
                case 4:
                    modificacion();
                    break;
                case 5:
                    entrada();
                    break;
                case 6:
                    salida();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
                    break;
            }
        } while (opcion!=7);
    }
}