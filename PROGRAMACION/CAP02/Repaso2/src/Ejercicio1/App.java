package Ejercicio1;
import Ejercicio1.Rectangulo.Rectangulo;

public class App {
    public static Double leerDouble() {
        return Double.parseDouble(System.console().readLine());
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca el ancho del rectángulo:");
        double ancho = leerDouble();
        System.out.print("Introduzca la altura del rectángulo:");
        double alto = leerDouble();
        Rectangulo rectangulo1 = new Rectangulo(0, 0);
        rectangulo1.setAncho(ancho);
        rectangulo1.setAlto(alto);
        rectangulo1.mostrardimensiones();
    }
}
