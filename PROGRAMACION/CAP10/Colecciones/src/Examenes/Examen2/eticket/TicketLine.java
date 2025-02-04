package Examenes.Examen2.eticket;

import Examenes.Examen2.eticket.interfaces.TicketLineInterface;
/**
 * TicketLine 
 * Mantiene información de una línea de un ticket 
 ** Una línea contiene información del producto y la cantidad comprada del mismo 
 * Debe poder: 
 ** - Devolver el producto de la línea 
 ** - Devolver la cantidad comprada del producto 
 ** - Modificar la cantidad comprada del producto 
 ** - Devolver el precio total de la línea (Cantidad*Precio del producto) 
 ** - Imprimir la línea del ticket de la siguiente manera: 
 * ------------------------- 50 ---------------------       --- 10 ---       --- 10 --- 
 * Levis 501                                          ( 1 x      79,95 € ) =      79,95 € 
 */
public class TicketLine implements TicketLineInterface {
    Product producto;
    int quantity;

    public TicketLine(Product producto, int quantity) {
        this.producto = producto;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return producto;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalLinePrice() {
        return producto.getPrice()*quantity;
    }

    @Override
    public String toString() {
        return String.format("%-50s( %d x %-10.2f $ ) = %-10.2f $", 
        this.producto.getTradeName(), this.quantity, this.producto.getPrice(), this.getTotalLinePrice());
    }
}