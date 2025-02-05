package Examenes.Examen.eticket.interfaces;

import Examenes.Examen.eticket.Product;
import Examenes.Examen.eticket.excepciones.*;

public interface StockInterface {

    public void addProduct(Product key, int cantidad);

    public void allocateProduct(Product key, int cantidad) throws ProductDoesNotExists, NotEnoughStock;

    public String toString();

}