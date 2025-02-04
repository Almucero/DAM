package Examenes.Examen2.eticket.interfaces;

import Examenes.Examen2.eticket.Product;
import Examenes.Examen2.eticket.excepciones.*;

public interface StockInterface {
    
    public void addProduct(Product product, int cantidad);

    public void allocateProduct(Product product, int cantidad) throws ProductDoesNotExists, NotEnoughStock; //removeStockFromProduct
    
    @Override
    public String toString();
}