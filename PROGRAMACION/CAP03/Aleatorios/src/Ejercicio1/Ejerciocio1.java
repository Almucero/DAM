package Ejercicio1;

public class Ejerciocio1 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*6)+1;
        int num2 = (int)(Math.random()*6)+1;
        int num3 = (int)(Math.random()*6)+1;
        int sumaDados = num1+num2+num3;
        System.out.printf("Tirada de tres dados: %d %d %d%n", num1, num2, num3);
        System.out.printf("Suma: %d", sumaDados);
    }
}