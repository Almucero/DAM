package Ejercicio14;

public class Pedido {
    String producto;
    int cantidad;

    public int getCantidad() {
        return cantidad;
    }
    public String getProducto() {
        return producto;
    }  

    public Pedido(String producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    } 
}