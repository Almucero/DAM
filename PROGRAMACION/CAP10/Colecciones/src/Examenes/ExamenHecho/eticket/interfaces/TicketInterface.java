package Examenes.ExamenHecho.eticket.interfaces;

import java.util.Date;

import Examenes.ExamenHecho.eticket.Product;
import Examenes.ExamenHecho.eticket.excepciones.*;

public interface TicketInterface {

    public Date getFecha();

    public int getCodigo();

    public void add(Product p, int cantidad) throws ProductDoesNotExists, NotEnoughStock;
    
    public void remove(Product p, int cantidad) throws ProductDoesNotExists, NotEnoughStock;

    public double getTotal();

    @Override
    String toString();
}