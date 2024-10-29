package Ejercicio2;

import Ejercicio2.Cuentabancaria.Cuentabancaria;

public class App {
    public static String leerString() {
        return System.console().readLine();
    }
    public static double leerDouble() {
        return Double.parseDouble(System.console().readLine());
    }
    public static void main(String[] args) {
        System.out.print("Introduzca el número de la cuenta: ");
        String num = leerString();
        System.out.print("Introduzca el titular de la cuenta: ");
        String tit = leerString();
        System.out.print("Introduzca el saldo de la cuenta: ");
        double saldo = leerDouble();
        System.out.println();
        Cuentabancaria cuentabancaria1 = new Cuentabancaria(num, tit, saldo);
        cuentabancaria1.mostrarInformacion();
        System.out.print("Ingrese la cantidad de dinero que quieres depositar: ");
        double deposito = leerDouble();
        cuentabancaria1.depositar(deposito);
        System.out.println();
        cuentabancaria1.mostrarInformacion();
        System.out.print("Ingrese la cantidad de dinero que quieres retirar: ");
        double retiro = leerDouble();
        cuentabancaria1.depositar(retiro);
        System.out.println();
        cuentabancaria1.mostrarInformacion();
    }
}
