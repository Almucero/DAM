package Examenes.Examen.eticket;

import Examenes.Examen.eticket.interfaces.TicketLineInterface;

public class TicketLine implements TicketLineInterface {
    private Product product;
    private int quantity;

    public TicketLine(Product product, int quantity) {
        this.product=product;
        this.quantity=quantity;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getTotalPrice() {
        return product.getPrice()*quantity;
    }

    @Override
    public String toString() {
        return String.format("%s                                          ( %d x      %.2f $ ) =      %.2f $", 
            product.getTradeName(), 
            quantity, 
            product.getPrice(), 
            getTotalPrice());
    }
}
/**
** TicketLine. Mantiene información de una línea de un ticket 
** Una línea contiene información del producto y la cantidad comprada del mismo 
** Debe poder: 
** - Devolver el producto de la línea 
** - Devolver la cantidad comprada del producto 
** - Modificar la cantidad comprada del producto 
** - Devolver el precio total de la línea (Cantidad*Precio del producto) 
* - Imprimir la línea del ticket de la siguiente manera: 
* ------------------------- 50 ---------------------       --- 10 ---       --- 10 --- 
* Levis 501                                          ( 1 x      79,95 € ) =      79,95 € 
*/