package Ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca un número entero y le dire cuantos digitos tiene: ");
        try {
            int num = Integer.parseInt(System.console().readLine());
            int digitos = 0;
            int temporal = num;
            do {
                temporal = temporal/10;
                digitos++;
            }
            while (temporal!=0);
            System.out.printf("%d tiene %d digito/s", num, digitos);
        }
        catch (NumberFormatException e) {
            System.out.println("Error. Debe introducir un número entero");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}