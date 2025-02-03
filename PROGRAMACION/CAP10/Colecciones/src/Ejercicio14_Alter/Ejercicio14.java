package Ejercicio14_Alter;

import java.util.HashMap;

public class Ejercicio14 {
    private static HashMap<String, Double> productos = new HashMap<String, Double>();

    public static void encontrarProducto(String producto) {
        for (int i=0; i<productos.size(); i++) {
            if (productos.containsKey(producto)) {
                
            }
        }
    }
    public static void main(String[] args) {

        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        do {
            System.out.print("Producto: ");
            String producto = System.console().readLine();
            if (producto.equals("fin")) {
                break;
            }
            System.out.print("Cantidad: ");
            String cantidadString = System.console().readLine();
            if (cantidadString.equals("fin")) {
                break;
            }
            try {
                int cantidad = Integer.parseInt(cantidadString);
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Introduzca un valor válido");
            }
        } while (true);
    }
}
/*
 * Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía. En esta primera versión del programa se tendrán en cuenta los productos que se indican en la tabla junto con su precio. 
 * Los productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que indicar el producto y el número de unidades que se compran, 
 * por ejemplo “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por ejemplo “3” si se quieren comprar 3 botes. 
 * La compra se termina con la palabra “fin. Suponemos que el usuario no va a intentar comprar un producto que no existe. Utiliza un diccionario para almacenar los nombres y precios de los productos y una o varias listas para almacenar la
compra que realiza el usuario.
A continuación se muestra una tabla con los productos disponibles y sus respectivos precios:

Ejemplo:
avena
garbanzos
tomate
jengibre
quinoa
guisantes
2,21
2,39
1,59
3,13
4,50
1,60

Producto: tomate
Cantidad: 1
Producto: quinoa
Cantidad: 2
Producto: avena
Cantidad: 1
Producto: tomate
Cantidad: 2
Producto: fin
Producto Precio Cantidad Subtotal
---------------------------------
tomate   1,59   1        1,59
quinoa   4,50   2        9,00
avena    2,21   1        2,21
tomate   1,59   2        3,18
---------------------------------
TOTAL: 15,98
 */