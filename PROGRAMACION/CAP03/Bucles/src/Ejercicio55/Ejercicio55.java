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
                int digito = num%10;
                int resultado = (digito*(int)Math.pow(10, _longitud)+num)/10;
                System.out.printf("El número resultado es %0"+_longitud+"d", resultado);
                break;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                break;
            }
        }
    }
}