package Ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        if (num<0) {
            System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
        }
        else {
            int suma = 0;
            for (int i = num; i <= num + 100; i++) {
                suma = suma+i;
            }
            System.out.println("La suma de los 100 números siguientes a "+num+" es "+suma+".");
        }
    }
}
//Terminar