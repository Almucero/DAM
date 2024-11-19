package Ejercicio36;

public class Ejercicio36 {
    public static long voltear(long num) {
        long numVolteado=0;
        while (num!=0) {
            numVolteado = (numVolteado*10)+(num%10);
            num = num/10;
        }
        return numVolteado;
    }
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean numValido=false;
        boolean esCapicua=true;
        long num=0;
        while (cerrar!=true) {
            try {
                while (numValido!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número entero positivo: ");
                        num = Long.parseLong(System.console().readLine());
                        if (num>=0) {
                            numValido=true;
                        }
                        else {
                            System.out.println("Error. Debe introducir un número entero positivo");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                long numAlterado = num*10+1; //Se añade un 1 al final para que cuando se le de la vuelta en caso de ser 0 el ultimo número no haya problemas
                numAlterado = voltear(numAlterado)*10+1; //Se da la vuelta y se añade otro 1 al final para que el número no deje de ser capicua debido al paso anterior
                long numAlteradoVolteado = voltear(numAlterado); //Se consigue el numero volteado verdadero, con dos 1, uno al inicio y otro al final
                while (numAlterado!=0 && esCapicua!=false) {
                    if ((numAlterado%10)!=(numAlteradoVolteado%10)) {
                        esCapicua=false;
                    }
                    numAlterado = numAlterado/10;
                    numAlteradoVolteado = numAlteradoVolteado/10;
                }
                if (esCapicua==true) {
                    System.out.printf("El %d es capicúa", num);
                }
                else {
                    System.out.printf("El %d no es capicúa", num);
                }
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}