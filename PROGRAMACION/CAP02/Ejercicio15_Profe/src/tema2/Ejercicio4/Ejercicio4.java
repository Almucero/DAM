package tema2.Ejercicio4;

public class Ejercicio4 {
    public static void ejercicio4(){
        double euros = 6;
        final double PESETAS_EURO = 166.386;
        int pesetas = (int)(euros * PESETAS_EURO);
        System.out.printf("%.2f euros son %d pesetas%n", euros, pesetas);
    }
}
