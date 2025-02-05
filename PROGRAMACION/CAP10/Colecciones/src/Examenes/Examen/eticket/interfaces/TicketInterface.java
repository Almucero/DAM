package Examenes.Examen.eticket.interfaces;

import java.util.Date;

import Examenes.Examen.eticket.Product;
import Examenes.Examen.eticket.excepciones.NotEnoughStock;
import Examenes.Examen.eticket.excepciones.ProductDoesNotExists;

public interface TicketInterface {

    public Date getDate();

    public int getCode();

    public void add(Product product, int amount) throws ProductDoesNotExists;

    public void remove(Product product, int amount) throws ProductDoesNotExists, NotEnoughStock;

    public double getTotalBill();

    public String toString();
}
/*
 ** - Obtener la fecha del ticket 
 ** - Obtener el código del ticket 
 ** - Añadir una cantidad de un producto determinado a la compra 
 ** - Quitar una cantidad de un producto determinado de la compra 
 ** Si no existe el producto debe lanzar una excepción (ProductDoesNotExists) 
 ** Si la cantidad de productos a retirar de un producto es mayor a la que existe en el ticket debe lanzar una excepción (NotEnoughStock) 
 ** - Obtener el total de la factura de la compra 
 ** - Imprimir el ticket de la siguiente manera:  
 */