package Examenes.Examen.eticket.interfaces;

import Examenes.Examen.eticket.Product;

public interface TicketLineInterface {

    public Product getProduct();

    public int getQuantity();

    public void setQuantity(int quantity);

    public double getTotalPrice();

    public String toString();
}
/** 
 ** - Devolver el producto de la línea 
 ** - Devolver la cantidad comprada del producto 
 ** - Modificar la cantidad comprada del producto 
 ** - Devolver el precio total de la línea (Cantidad*Precio del producto) 
 ** - Imprimir la línea del ticket de la siguiente manera:  
 */