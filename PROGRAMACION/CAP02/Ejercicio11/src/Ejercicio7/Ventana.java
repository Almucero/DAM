package Ejercicio7;

public class Ventana {
    private Punto desplazamiento;
    private int anchura;
    private int altura;
    private boolean con_foco;
    private boolean cerrando;
    private boolean minimizada;
    private boolean maximizada;

    public void mover(Punto destino){
        desplazamiento.setX(destino.getX());
        desplazamiento.setY(destino.getY());
    }

    public void cerrar(){
        this.cerrando = true;
    }

    public void minimizar(){
        this.minimizada = true;
    }

    public void maximizar(){
        this.maximizada = true;
    }

    
    
}
