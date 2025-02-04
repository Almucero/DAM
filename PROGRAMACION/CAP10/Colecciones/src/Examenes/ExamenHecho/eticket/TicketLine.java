package Examenes.ExamenHecho.eticket;

import Examenes.ExamenHecho.eticket.interfaces.TicketLineInterface;

public class TicketLine implements TicketLineInterface{
    private Product producto;
    private int cantidad;

    public TicketLine(Product producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    @Override
    public Product getProduct() {
        return this.producto;
    }

    @Override
    public int getCantidadComprada() {
        return this.cantidad;
    }

    @Override
    public void modificarCantidadComprada(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double devolverPrecioTotal() {
        return this.producto.getPrice() * this.cantidad;
    }

    @Override
    public String toString() {
        return String.format("%50s ( %d x %10.2f € ) = %10.2f", 
        this.producto.getTradeName(), this.cantidad, this.producto.getPrice(), this.cantidad * this.producto.getPrice());
    }
}