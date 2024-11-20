package Ejercicio24;

public class Ejercicio24 {
    public static long longitud(long num) {
        long longitudNum=0;
        while (num!=0) {
            num = num/10;
            longitudNum++;
        }
        return longitudNum;
    }
    public static void main(String[] args) {
        long num=0;
        long digito=0;
        while (true) {
            try {
                System.out.print("Por favor, introduzca un número entero positivo: ");
                num = Long.parseLong(System.console().readLine());
                if (num>=0) {
                    break;
                }
                else {
                    System.out.println("Error. Debe introducir un número positivo");
                    System.out.println();
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e);
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                System.out.println();
            }
        }
        final long MAXIMO=longitud(num);
        final long MINIMO=1;
        long aleatorio = (long)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
        for (int i=1; i<=aleatorio; i++) {
            digito=num%10;
            num = num/10;
        }
        System.out.println(digito);
    }
}