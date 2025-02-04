package Examenes.Examen2.eticket;

import java.util.HashMap;
import Examenes.Examen2.eticket.excepciones.*;
import Examenes.Examen2.eticket.interfaces.StockInterface;
/** StockInterface 
 * Mantiene información sobre el stock de la tienda 
 ** Para facilitar las cosas se te indica como debe manejar el stock haciendo uso de un HashMap 
 ** Por cada producto almacenado se tiene información de la cantidad disponible del mismo 
 * Debe poder: 
 ** - Añadir producto y retirar producto del stock 
 ** - Imprimir el stock de la tienda de la siguiente manera: 
 * Ej: 
 * ********************************** 
 * Código: 7 
 * Marca: C&A 
 * Modelo: G123456 
 * Nombre comercial: Vestido señora 
 * Precio: 119,95 € 
 * Stock disponible: 10 
 * ********************************** 
 * Código: 1 
 * Marca: Levis 
 * Modelo: A123456 
 * Nombre comercial: Levis 501 
 * Precio: 79,95 € 
 * Stock disponible: 10 
 * 
 ** Al añadir producto recibirá el producto y la cantidad a añadir 
 ** Al retirar producto recibirá el producto y la cantidad a retirar. 
 ** Si el producto no existe deberá lanzar una execpción (ProductDoesNotExists) 
 ** Si no existe suficiente stock para retirar deberá lanzar una excepción (NotEnoughStock) 
 ** En el caso de que el producto no exista deberá lanzar una excepción indicando de que el producto no existe. 
 ** En el caso de que no existan suficientes existencias deberá lanzar una excepción indicando de que no hay suficiente stock. 
 */
public class Stock implements StockInterface {
    HashMap<Product, Integer> stock;

    public Stock() {
        stock = new HashMap<Product, Integer>();
    }

    @Override
    public void addProduct(Product product, int cantidad) {
        if (!stock.containsKey(product)) {
            stock.put(product, cantidad);
        }
        else {
            stock.replace(product, stock.get(product)+cantidad);
        }
    }

    @Override
    public void allocateProduct(Product product, int cantidad) throws ProductDoesNotExists, NotEnoughStock {
        if (!stock.containsKey(product)) {
            throw new ProductDoesNotExists();
        }
        if (stock.get(product)<cantidad) {
            throw new NotEnoughStock();
        }
        if (stock.get(product)==cantidad) {
            stock.remove(product);
        }
        else {
            stock.replace(product, stock.get(product)-cantidad);
        }
    }

    @Override
    public String toString() {
        String listado = "";
        Object[] productos = stock.keySet().toArray();
        for (int i=0; i<productos.length; i++) {
            if (productos[i]!=null) {
                Product producto = (Product)productos[i];
                listado += String.format("""
                    ********************************** 
                    Código: %d 
                    Marca: %s 
                    Modelo: %s 
                    Nombre comercial: %s 
                    Precio: %.2f $ 
                    Stock disponible: %d 
                    """, 
                    producto.getCode(), producto.getBrand(), producto.getModel(), producto.getTradeName(), producto.getPrice(), stock.get(producto));
            }
        }
        return listado;
    }
}