package Ejercicio32;

public class Ejercicio32 {
    public static int longitud(int num) {
        int longitudNum=0;
        while (num!=0) {
            num = num/10;
            longitudNum++;
        }
        return longitudNum;
    }
    public static int voltear(int num) {
        int numVolteado=0;
        while (num!=0) {
            numVolteado = (numVolteado*10)+(num%10);
            num = num/10;
        }
        return numVolteado;
    }
    public static void main(String[] args) {
        boolean cerrar=false;
        boolean numValido=false;
        int num=0;
        int sumaPares=0;
        while (cerrar!=true) {
            try {
                while (numValido!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número entero positivo: ");
                        num = Integer.parseInt(System.console().readLine());
                        if (num>=0) {
                            num = num*10+1;
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
                int numVolteado = voltear(num);
                System.out.printf("Dígitos pares: ");
                while (numVolteado!=0) {
                    int digito = numVolteado%10;
                    if (digito%2==0) {
                        System.out.printf("%d ", digito);
                        sumaPares = sumaPares+digito;
                    }
                    numVolteado = numVolteado/10;
                }
                System.out.printf("%nSuma de los dígitos pares: %d", sumaPares);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}