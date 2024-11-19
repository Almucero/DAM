package Ejercicio51;

public class Ejercicio51 {
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean numAceptado=false;
        boolean comido=false;
        int num=0;
        int resultado=0;
        int multiplicando=1;
        while (cerrar!=true) {
            try {
                while (numAceptado!=true) {
                    try {
                        System.out.print("Introduzca un número entero (mayor que cero): ");
                        num = Integer.parseInt(System.console().readLine());
                        if (num>0) {
                            numAceptado=true;
                        }
                        else {
                            System.out.println("Por favor, introduzca un número entero mayor que cero");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                while (num!=0) {
                    int digito = num%10;
                    if (digito==0 && digito==8) {
                        comido=true;
                    }
                    else {
                        resultado += digito * multiplicando;
                        multiplicando *= 10;
                    }
                    num = num/10;
                }
                if (comido) {
                    System.out.printf("Después de haber sido comido por el gusano numérico se queda en %d", resultado);
                }
                else {
                    System.out.println("El gusano numérico no se ha comido ningún dígito");
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
/*
 * import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero (mayor que cero): ");
        long numero = sc.nextLong();
        long original = numero;
        long resultado = 0;
        long multiplicador = 1;
        boolean comido = false;

        while (numero > 0) {
            long digito = numero % 10;
            if (digito != 0 && digito != 8) {
                resultado += digito * multiplicador;
                multiplicador *= 10;
            } else {
                comido = true;
            }
            numero /= 10;
        }

        if (comido) {
            System.out.println("Después de haber sido comido por el gusano numérico se queda en " + resultado + ".");
        } else {
            System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }

        sc.close();
    }
}
 */