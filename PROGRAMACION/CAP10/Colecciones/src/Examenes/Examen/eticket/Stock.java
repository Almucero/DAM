package Examenes.Examen.eticket;

import java.util.HashMap;

import Examenes.Examen.eticket.excepciones.*;
import Examenes.Examen.eticket.interfaces.StockInterface;

public class Stock implements StockInterface {

    HashMap<Product, Integer> stock;

    public Stock() {
        stock = new HashMap<Product, Integer>();
    }
    
    public void addProduct(Product key, int cantidad) {
        if (stock.containsKey(key)) {
            stock.replace(key, stock.get(key)+cantidad);
        }
        else {
            stock.put(key, cantidad);
        }
    }

    public void allocateProduct(Product key, int cantidad) throws ProductDoesNotExists, NotEnoughStock { //retirar
        if (!stock.containsKey(key)) {
            throw new ProductDoesNotExists();
        }
        if (stock.get(key)<cantidad) {
            throw new NotEnoughStock();
        }
        stock.replace(key, stock.get(key)-cantidad);
    }

    @Override
    public String toString() {
        String listado="";
        Object[] productos = stock.keySet().toArray();
        for (int i=0; i<productos.length; i++) {
            Product stockProduct = (Product)productos[i];
            listado += String.format("""
                Código: %d
                Marca: %s
                Modelo: %s
                Nombre comercial: %s
                Precio: %.2f $
                Stock disponible: %d
                """, stockProduct.getCode(), stockProduct.getBrand(), stockProduct.getModel(), stockProduct.getTradeName(), stockProduct.getPrice(), stock.get(stockProduct));
        }
        return listado;
    }
    /*
    @Override
    public String toString() {
        String listado="";
        for (Product stockProduct : stock.keySet()) {
            listado += String.format("""
                Código: %d
                Marca: %s 
                Modelo: %s 
                Nombre comercial: %s 
                Precio: %.2f $ 
                Stock disponible: %d 
                """, 
                stockProduct.getCode(), 
                stockProduct.getBrand(), 
                stockProduct.getModel(), 
                stockProduct.getTradeName(), 
                stockProduct.getPrice(),
                stock.get(stockProduct));
        }
        return listado;
    } */
}