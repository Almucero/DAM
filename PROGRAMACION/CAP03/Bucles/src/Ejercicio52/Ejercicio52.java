package Ejercicio52;

public class Ejercicio52 {
    public static int moverDigitos(int num) {
        int digitoFinal=num/(int)Math.pow(10, longitud(num)-1);
        num=voltear(voltear(num)/10)*10+digitoFinal;
        return num;
    }
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
        int num=0;
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
                int _longitud=longitud(num);
                System.out.printf("El número resultado es %0"+_longitud+"d", moverDigitos(num));
                break;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                break;
            }
        }
    }
}