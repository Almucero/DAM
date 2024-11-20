package Ejercicio16;

public class Ejercicio16 {
    public static String generarFigura() {
        int aleatorio = (int)(Math.random()*5)+1;
         return switch (aleatorio) {
            case 1-> "corazón";
            case 2-> "diamante";
            case 3-> "herradura";
            case 4-> "camapana";
            case 5-> "limon";
            default->"";
        };
    }
    public static void main(String[] args) {
        int iguales=0;
        String figura1 = generarFigura();
        String figura2 = generarFigura();
        String figura3 = generarFigura();
        System.out.printf("%s %s %s%n", figura1, figura2, figura3);
        if (figura1.equals(figura2)) {
            iguales++;
        }
        if (figura1.equals(figura3)) {
            iguales++;
        }
        if (figura2.equals(figura3)) {
            iguales++;
        }
        switch (iguales) {
            case 0-> System.out.println("Lo siento, ha perdido");
            case 1-> System.out.println("Bien, ha recuperado su moneda");
            default-> System.out.println("Enhorabuena, ha gaando 10 mnedas");
        }
    }
}