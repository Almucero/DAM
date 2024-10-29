package tema3;

public class Ejercicio1 {
    public static int leerEntero(){
        return Integer.parseInt(System.console().readLine());
    }

    public static void ejercicio1(){
        try {
            System.out.println("Este programa multiplica dos números enteros.");
            System.out.print("Por favor, introduzca el primer número: ");
            int a = leerEntero();
            System.out.print("Introduzca el segundo número: ");
            int b = leerEntero();
            System.out.printf("%d * %d = %d", a, b, a*b);    
        } catch(NumberFormatException e){
            System.out.println("Debe introducir un número entero");
        } 
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
