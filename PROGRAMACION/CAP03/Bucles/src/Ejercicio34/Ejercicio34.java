package Ejercicio34;

public class Ejercicio34 {
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
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean num1Valido=false;
        boolean num2Valido=false;
        int num1=0;
        int num2=0;
        int numPares=0;
        int numImpares=0;
        while (cerrar!=true) {
            try {
                while (num1Valido!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número: ");
                        num1 = Integer.parseInt(System.console().readLine());
                        num1Valido=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                while (num2Valido!=true) {
                    try {
                        System.out.print("Introduzca otro número: ");
                        num2 = Integer.parseInt(System.console().readLine());
                        if (longitud(num1)!=longitud(num2)) {
                            System.out.println("Error. Debe introducir un número de la misma longitud que el primero");
                            System.out.println();
                        }
                        else {
                            num2Valido=true;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                int num1AlteradoVolteado = voltear(num1*10+1);
                int num2AlteradoVolteado = voltear(num2*10+1);
                for (int i=1; i<longitud(num1); i++) {
                    int digitoNum1 = num1AlteradoVolteado%10;
                    int digitoNum2 = num2AlteradoVolteado%10;
                    if (digitoNum1%2==0) {
                        numPares = numPares*10+digitoNum1;
                    }
                    else {
                        numImpares = numImpares*10+digitoNum1;
                    }
                    if (digitoNum2%2==0) {
                        numPares = numPares*10+digitoNum2;
                    }
                    else {
                        numImpares = numImpares*10+digitoNum2;
                    }
                    num1AlteradoVolteado = num1AlteradoVolteado/10;
                    num2AlteradoVolteado = num2AlteradoVolteado/10;
                }
                if (numPares==0) {
                    System.out.println("Ninguno de los 2 número contenía dígitos pares");
                }
                else {
                    System.out.printf("El número formado por los dígitos pares es %d%n", numPares);
                }
                if (numImpares==0) {
                    System.out.println("Ninguno de los 2 número contenía dígitos impares");
                }
                else {
                    System.out.printf("El número formado por los dígitos impares es %d%n", numImpares);
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