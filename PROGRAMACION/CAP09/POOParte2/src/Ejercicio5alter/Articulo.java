package Ejercicio5alter;

import Ejercicio5alter.Excepciones.*;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioVenta;
    private double precioCompra;
    private int stock;

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) throws StockException {
        if (stock<0) {
            throw new StockException();
        }
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static String generarCodigo(int longitud) {
        String codigo="";
        char maxLetra='Z';
        char minLetra='A';
        char maxNum='9';
        char minNum='0';
        for (int i=1; i<=longitud; i++) {
            if (Math.random()>=0.5) {
                codigo += (char)(Math.random()*(maxLetra-minLetra-1)+minLetra);
            }
            else {
                codigo += (char)(Math.random()*(maxNum-minNum-1)+minNum);
            }
        }
        return codigo;
    }

    public Articulo(String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo=generarCodigo(3);
        this.descripcion=descripcion;
        this.precioCompra=precioCompra;
        this.precioVenta=precioVenta;
        this.stock=stock;
    }

    @Override
    public String toString() {
        return String.format("""
            ------------------------------------------
            Código: %s
            Descripción: %s
            Precio de compra: %f
            Precio de venta: %f
            Stock: %d
            ------------------------------------------
            """, codigo, descripcion, precioCompra, precioVenta, stock);
    }
}