package Examenes.Examen2.eticket;

import java.util.Date;
import java.util.HashMap;
import Examenes.Examen2.eticket.excepciones.*;
import Examenes.Examen2.eticket.interfaces.TicketInterface;
/**
 * Ticket 
 * Mantiene información de un Ticket de compra 
 ** Debe almacenar el código del ticket que se genera automáticamente empezando en 1, la fecha del ticket y las compras realizadas 
 ** Para facilitar las cosas se te indica como debe manejar los productos del ticket haciendo uso de un HashMap (Obviamente debes haber implementado la clase TicketLine antes que esta) 
 * Debe poder: 
 ** - Obtener la fecha del ticket 
 ** - Obtener el código del ticket 
 ** - Añadir una cantidad de un producto determinado a la compra 
 ** - Quitar una cantidad de un producto determinado de la compra 
 ** Si no existe el producto debe lanzar una excepción (ProductDoesNotExists) 
 ** Si la cantidad de productos a retirar de un producto es mayor a la que existe en el ticket debe lanzar una excepción (NotEnoughStock) 
 ** - Obtener el total de la factura de la compra 
 ** - Imprimir el ticket de la siguiente manera: 
 * ------------------------- 50 ---------------------       --- 10 ---       --- 10 --- 
 *                                          Levis 501 ( 1 x      79,95 € ) =      79,95 € 
 *                                  Camisa strech fit ( 2 x      49,95 € ) =      99,90 € 
 *                              Zapato caballero piel ( 3 x      99,95 € ) =     299,85 € 
 *                                              Total 479,70 € 
 */
public class Ticket implements TicketInterface {
    private static int nextCode = 1;
    private int code;
    private Date date;
    HashMap<Product, TicketLine> lineas;

    public Date getDate() {
        return date;
    }
    public int getCode() {
        return code;
    }

    public Ticket() {
        this.code = nextCode++;
        lineas = new HashMap<Product, TicketLine>();
        this.date = new Date();
    }

    public void add(Product product, int amount) {
        if (!lineas.containsKey(product)) {
            lineas.put(product, new TicketLine(product, amount));
        }
        else {
            lineas.get(product).setQuantity(lineas.get(product).getQuantity()+amount);
        }
    }

    public void remove(Product product, int amount) throws ProductDoesNotExists, NotEnoughStock {
        if (!lineas.containsKey(product)) {
            throw new ProductDoesNotExists();
        }
        if (lineas.get(product).getQuantity()<amount) {
            throw new NotEnoughStock();
        }
        if (lineas.get(product).getQuantity()==amount) {
            lineas.remove(product);
        }
        else {
            lineas.get(product).setQuantity(lineas.get(product).getQuantity()-amount);
        }
    }

    public double getTotalBill() {
        double totalBill = 0;
        for (TicketLine ticketLine : lineas.values()) {
            totalBill += ticketLine.getTotalLinePrice();
        }
        return totalBill;
    }

    @Override
    public String toString() {
        String listado = "";
        for (TicketLine ticketLine : lineas.values()) {
            listado += ticketLine.toString()+"\n";
        }
        listado += String.format("%-50s %10.2f $", "Total", getTotalBill());
        return listado;
    }

    /*    
    @Override
    public String toString() {
        String listado = "";
        Object[] keys = lineas.keySet().toArray();
        for (int i=0; i<keys.length; i++) {
            Product product = (Product)keys[i];
            listado += lineas.get(product).toString()+"\n";
        }
        return listado;
    } 
    */
}