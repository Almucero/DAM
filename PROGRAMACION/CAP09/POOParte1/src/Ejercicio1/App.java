package Ejercicio1;

public class App {
    public static void main(String[] args) {
        Caballo c1 = new Caballo("Francisco", "Pegaso", 10, 50, "negro");
        Caballo c2 = new Caballo("Jesús", "Burro", 20, 70, "marrón");
        Caballo c3 = new Caballo("Abascal", "Unicornio", 30, 90, "blanco");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c3.fusionarCaballos(c1));
    }
}
