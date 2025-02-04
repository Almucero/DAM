package Examenes.ExamenHecho.eticket.interfaces;

import Examenes.ExamenHecho.eticket.Product;
import Examenes.ExamenHecho.eticket.excepciones.*;

public interface StockInterface {

    public void allocateProduct(Product p, int cantidad) throws NotEnoughStock, ProductDoesNotExists;

    public void addProduct(Product p, int cantidad) throws ProductDoesNotExists;
}