package poo;

public class Calculadora {
    double lcd = 0;
    String nombre="";

    public Calculadora(String nombre){
        this.lcd = 0;
        this.nombre = nombre;
    }
    public Calculadora(String nombre, double inicial){
        this.lcd = inicial;
        this.nombre = nombre;
    }
    public void entrada(int digito){
        this.lcd = this.lcd*10+digito;    
    }
    public String mostrar(){
        return String.format("%s -> %s", this.nombre, "" + this.lcd);
    }
    public double getLcd() {
        return lcd;
    }
}