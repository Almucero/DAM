package Producto;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aumentarCantidad(int cantidad) {
        this.cantidad = this.cantidad + cantidad;
    }
    
    public void reducirCantidad(int cantidad) {
        if (this.cantidad < cantidad) {
            System.out.println("No hay tantos productos");
        }
        else {
            this.cantidad = this.cantidad - cantidad;
        }
    }

    public void mostarInfo() {
        System.out.println();
        System.out.println("Información del producto: ");
        System.out.println("Producto: "+this.nombre);
        System.out.println("Precio: "+this.precio+"$");
        System.out.println("Cantidad: "+this.cantidad+" unidades");
    }
}
