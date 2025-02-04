package Examenes.ExamenHecho.eticket;

import java.util.HashMap;

import Examenes.ExamenHecho.eticket.excepciones.*;
import Examenes.ExamenHecho.eticket.interfaces.StockInterface;

public class Stock implements StockInterface{
    private HashMap<Product, Integer> totalStock;

    public Stock () {
        totalStock = new HashMap<>();
    }

    public HashMap<Product, Integer> getTotalStock() {
        return totalStock;
    }

    @Override
    public void allocateProduct(Product p, int cantidad) throws NotEnoughStock, ProductDoesNotExists {
        if (cantidad > totalStock.get(p)) {
            throw new NotEnoughStock();
        }

        if (!totalStock.containsKey(p) || p == null) {
            throw new ProductDoesNotExists();
        }

        int antiguaCantidad = totalStock.get(p);
        totalStock.put(p, antiguaCantidad - cantidad);
    }

    @Override
    public void addProduct(Product p, int cantidad){
        if (p == null) {
            System.out.println("El producto no existe");
        }

        if (cantidad <= 0) {
            System.out.println("No se puede añadir 0 o menos cantidad");
        }

        if (totalStock.containsKey(p)) {
            int antiguaCantidad = totalStock.get(p);
            totalStock.put(p, antiguaCantidad + cantidad);
        } else {
            totalStock.put(p, cantidad);
        }
    }
    
    @Override
    public String toString() {
        String productos = "";
        for(Product p:totalStock.keySet()) {
            if (p != null) {
                productos += String.format("""
                Código: %d
                Marca: %s
                Modelo: %s
                Nombre comercial: %s
                Precio: %.2f
                Stock disponible: %d
                **********************************

            """, p.getCode(), p.getBrand(), p.getModel(), p.getTradeName(), p.getPrice(), totalStock.get(p));
            }
        }
        return productos;
    }
}
