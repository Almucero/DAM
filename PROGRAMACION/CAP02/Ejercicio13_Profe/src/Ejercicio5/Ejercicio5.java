package Ejercicio5;

public class Ejercicio5 {

    public static void resuelve(){
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        
        try {
            System.out.print("Por favor, introduzca el valor de a: ");
            double a = Double.parseDouble(System.console().readLine());
            System.out.print("Ahora introduzca el valor de b: ");    
            double b = Double.parseDouble(System.console().readLine());    
            if(a!=0)
                System.out.printf("x = %.2f", -b/a);
            else
                System.out.println("No tiene solución real");
        } catch (Exception e) {
            System.err.println("Ocurrió un error");
        }
    }
    
}
