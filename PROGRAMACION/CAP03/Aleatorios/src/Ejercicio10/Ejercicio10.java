package Ejercicio10;

public class Ejercicio10 {
    public static void main(String[] args) {
        String caracter="";
        for (int i=1; i<=10; i++) {
            int aleatorio = (int)(Math.random()*6)+1;
            switch (aleatorio) {
                case 1-> caracter="*";
                case 2-> caracter="-";
                case 3-> caracter="=";
                case 4-> caracter=".";
                case 5-> caracter="|";
                case 6-> caracter="@";
            };
            int longitud = (int)(Math.random()*40)+1;
            for (int j=1; j<=longitud; j++) {
                System.out.print(caracter);
            }
            System.out.println(); 
        }
    }
}