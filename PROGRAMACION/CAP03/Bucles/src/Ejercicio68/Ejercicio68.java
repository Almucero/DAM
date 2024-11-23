package Ejercicio68;

public class Ejercicio68 {
    public static long solicitarNumero() {
        long num;
        while (true) {
            try {
                System.out.print("Por favor, introduzca un número: ");
                num = Long.parseLong(System.console().readLine());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return num;
    }
    public static long voltear(long num) {
        long numVolteado=0;
        while (num!=0) {
            numVolteado = (numVolteado*10)+(num%10);
            num = num/10;
        }
        return numVolteado;
    }
    public static void main(String[] args) {
        long numDislocado=0;
        long num = solicitarNumero();
        long numVolteado = voltear((num*10+1));
        while (numVolteado!=0) {
            long digito = numVolteado%10;
            if (digito%2==0) {
                digito = digito+1;
            }
            else {
                digito = digito-1;
            }
            numDislocado = numDislocado*10+digito;
            numVolteado = numVolteado/10;
        }
        System.out.printf("Dislocando el %d sale el %d", num, numDislocado/10);
    }
}