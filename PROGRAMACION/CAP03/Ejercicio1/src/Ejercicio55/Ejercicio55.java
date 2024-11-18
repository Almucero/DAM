package Ejercicio55;

public class Ejercicio55 {
    public static int longitud(int num) {
        int longitudNum=0;
        while (num!=0) {
            num = num/10;
            longitudNum++;
        }
        return longitudNum;
    }
    public static void main(String[] args) {
        boolean cerrar=false;
        boolean numAceptado=false;
        int num=0;
        while (cerrar!=true) {
            try {
                while (numAceptado!=true) {
                    try {
                        System.out.print("Introduzca un número: ");
                        num = Integer.parseInt(System.console().readLine());
                        numAceptado=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido: "+e);
                        System.out.println();
                    }
                }
                int digito = num%10;
                num = num/10;
                int resultado = digito*(int)Math.pow(10, longitud(num))+num;
                System.out.printf("El número resultado es %0"+(longitud(num)+1)+"d", resultado);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                cerrar=true;
            }
        }
    }
}