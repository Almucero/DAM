package Examenes.ExamenHecho.eticket;

import java.util.Date;
import java.util.HashMap;

import Examenes.ExamenHecho.eticket.excepciones.*;
import Examenes.ExamenHecho.eticket.interfaces.TicketInterface;

public class Ticket implements TicketInterface{
    private static int siguienteCodigo = 1;
    private int codigo;
    private Date fecha;
    private HashMap<Product, TicketLine> lineas;

    public Ticket() {
        this.codigo = siguienteCodigo++;
        this.fecha = new Date();
        lineas = new HashMap<>();
    }

    @Override
    public Date getFecha() {
        return this.fecha;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public void add(Product p, int cantidad) throws ProductDoesNotExists{
        if (p == null) {
            throw new ProductDoesNotExists();
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("El numero debe de ser mayor a 0");
        }

        if (lineas.containsKey(p)) {
            TicketLine linea = lineas.get(p);
            linea.modificarCantidadComprada(linea.getCantidadComprada() + cantidad);
        } else {
            lineas.put(p, new TicketLine(p, cantidad));
        }
    }

    @Override
    public void remove(Product p, int cantidad) throws ProductDoesNotExists, NotEnoughStock{
        if (p == null || !lineas.containsKey(p)) {
            throw new ProductDoesNotExists();
        }
        TicketLine linea = lineas.get(p);
        if (cantidad > linea.getCantidadComprada()) {
            throw new IllegalArgumentException("El numero debe de ser mayor a 0");
        }   

        if (cantidad == linea.getCantidadComprada()) {
            lineas.remove(p);
        } else {
            linea.modificarCantidadComprada(linea.getCantidadComprada() - cantidad);
        }
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (TicketLine linea : lineas.values()) {
            total += linea.devolverPrecioTotal();
        }
        return total;
    }
    
    @Override
    public String toString() {
        String ticket = "";
        for (TicketLine linea : lineas.values()) {
            ticket = linea.toString();
        }
        ticket += String.format("%n%50s %-10.2f", "Total", getTotal());
        return ticket;
    }
}
