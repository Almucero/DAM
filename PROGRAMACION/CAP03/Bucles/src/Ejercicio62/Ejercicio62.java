package Ejercicio62;

public class Ejercicio62 {
    public static void main(String[] args) {
        int num=0;
        int numAfortunados=0;
        int numDesafortunados=0;
        while (true) {
            try {
                while (true) {
                    try {
                        System.out.print("Introduzca un número: ");
                        num = Integer.parseInt(System.console().readLine());
                        break;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido: "+e);
                        System.out.println();
                    }
                }
                int temp=num;
                while (temp!=0) {
                    int digito = temp%10;
                    if (digito==3 || digito==7 || digito==8 || digito==9) {
                        numAfortunados++;
                    }
                    else {
                        numDesafortunados++;
                    }
                    temp = temp/10;
                }
                if (numAfortunados>numDesafortunados) {
                    System.out.printf("El %d es un número afortunado", num);
                }
                else {
                    System.out.printf("El %d no es un número afortunado", num);
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                break;
            }
        }
    }
}