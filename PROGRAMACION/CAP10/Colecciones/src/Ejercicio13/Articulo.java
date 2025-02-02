package Ejercicio13;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public String getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public static String generarCodigo() {
        char maxLetra = 'Z';
        char minLetra = 'A';
        char maxNumero = '9';
        char minNumero = '0';
        String codigo = "";
        for (int i=0; i<3; i++) {
            if (Math.random()>0.5) {
                codigo += (char)(Math.random()*(maxLetra-minLetra+1)+minLetra);
            }
            else {
                codigo += (char)(Math.random()*(maxNumero-minNumero+1)+minNumero);
            }
        }
        return codigo;
    }

    public Articulo(String descripcion, double precioCompra, double precioVenta, int stock) {
        this.descripcion=descripcion;
        this.precioCompra=precioCompra;
        this.precioVenta=precioVenta;
        this.stock=stock;
        this.codigo=generarCodigo();
    }

    @Override
    public String toString() {
        return String.format("""
            ------------------------------------------
            Código: %s
            Descripción: %s
            Precio de compra: %.2f
            Precio de venta: %.2f
            Stock: &d unidades
            ------------------------------------------
            """, this.codigo, this.descripcion, this.precioCompra, this.precioVenta, this.stock);
    }
}