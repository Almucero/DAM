package Ejercicio23;

public class Ejercicio23 {
    public static void main(String[] args) {
        String figura="";
        for (int i=1; i<=5; i++) {
            int aleatorio = (int)(Math.random()*6)+1;
            switch (aleatorio) {
                case 1-> figura="As";
                case 2-> figura="K";
                case 3-> figura="Q";
                case 4-> figura="J";
                case 5-> figura="7";
                case 6-> figura="8";
            }
            System.out.printf("%s ", figura);
        }
    }
}
