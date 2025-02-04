package Examenes.Examen.eticket;

import java.util.Date;
import java.util.HashMap;

import Examenes.Examen.eticket.excepciones.*;
import Examenes.Examen.eticket.interfaces.TicketInterface;

public class Ticket implements TicketInterface {
    private static int nextCode=1;
    private int code;
    private Date date;

    public Ticket() {
        this.code = nextCode++;
        this.date = new Date();
    }

    @Override
    public Date getDate() {
        return date;
    }
    @Override
    public int getCode() {
        return code;
    }
    @Override
    public void add(Product product, int amount) throws ProductDoesNotExists {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public void remove(Product product, int amount) throws ProductDoesNotExists, NotEnoughStock {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public double getTotalBill() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotalPrice'");
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
/**
* Ticket. Mantiene información de un Ticket de compra 
* Debe almacenar el código del ticket que se genera automáticamente empezando en 1, la fecha del ticket y las compras realizadas 
* Para facilitar las cosas se te indica como debe manejar los productos del ticket haciendo uso de un HashMap (Obviamente debes haber implementado la clase TicketLine antes que esta) 
* Debe poder: 
* - Obtener la fecha del ticket 
* - Obtener el código del ticket 
* - Añadir una cantidad de un producto determinado a la compra 
* - Quitar una cantidad de un producto determinado de la compra 
* Si no existe el producto debe lanzar una excepción (ProductDoesNotExists) 
* Si la cantidad de productos a retirar de un producto es mayor a la que existe en el ticket debe lanzar una excepción (NotEnoughStock) 
* - Obtener el total de la factura de la compra 
* - Imprimir el ticket de la siguiente manera: 
* ------------------------- 50 ---------------------       --- 10 ---       --- 10 --- 
*                                          Levis 501 ( 1 x      79,95 € ) =      79,95 € 
*                                  Camisa strech fit ( 2 x      49,95 € ) =      99,90 € 
*                              Zapato caballero piel ( 3 x      99,95 € ) =     299,85 € 
*                                              Total 479,70 € 
*/