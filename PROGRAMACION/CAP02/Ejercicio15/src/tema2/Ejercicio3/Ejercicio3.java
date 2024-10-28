package tema2.Ejercicio3;

public class Ejercicio3 {
    public static void ejercicio3() {
        double euros = 6;
        final double PESETAS_EURO = 166.386;
        int pesetas = (int)(euros * PESETAS_EURO);
        System.out.printf("%.2f euros son %d pesetas", euros, pesetas);
    }
}