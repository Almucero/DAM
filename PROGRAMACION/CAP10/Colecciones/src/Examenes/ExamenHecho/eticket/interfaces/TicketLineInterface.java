package Examenes.ExamenHecho.eticket.interfaces;

import Examenes.ExamenHecho.eticket.Product;

public interface TicketLineInterface {

    public Product getProduct();

    public int getCantidadComprada();

    public void modificarCantidadComprada(int cantidad);

    public double devolverPrecioTotal();
}