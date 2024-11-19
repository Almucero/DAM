package Ejercicio48;

public class Ejercicio48 {
    public static void DigitosNumero(long num, boolean condicion) {
        boolean primero=true;
        for (int i=0; i<=9; i++) {
            long temp=num;
            boolean aparece=false;
            while (temp!=0) {
                if (temp%10==i) {
                    aparece=true;
                }
                temp = temp/10;
            }
            if (aparece==condicion) {
                if (!primero) {
                    System.out.print(" ");
                }
                System.out.print(i);
                primero=false;
            }
        }
    }
    public static void main(String[] args) {
        boolean cerrar=false;
        boolean numAceptado=false;
        long num=0;
        while (cerrar!=true) {
            try {
                while (numAceptado!=true) {
                    try {
                        System.out.print("Introduzca un número entero: ");
                        num = Long.parseLong(System.console().readLine());
                        numAceptado=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                System.out.print("Dígitos que aparecen en el número: ");
                DigitosNumero(num, true);
                System.out.printf("%nDígitos que no aparecen en el número: ");
                DigitosNumero(num, false);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        } 
    }
}