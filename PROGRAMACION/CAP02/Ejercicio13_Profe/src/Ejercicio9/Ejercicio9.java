package Ejercicio9;

public class Ejercicio9 {
    public static void resuelve(){
        System.out.println("Este programa resuelve ecuaciones de segundo grado. ax^2 + bx + c = 0");
        System.out.println("Por favor, introduzca los valores.");
        try {
            System.out.print("a = ");
            double a = Double.parseDouble(System.console().readLine());
            System.out.print("b = ");
            double b = Double.parseDouble(System.console().readLine());
            System.out.print("c = ");
            double c = Double.parseDouble(System.console().readLine());
            if(a!=0 && b*b >= 4*a*c)
                System.out.printf(
                    "x1 = %.1f\nx2 = %.1f", 
                    (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a, 
                    (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
            
            else
                System.out.println("No existe solución real");

        } catch (Exception e) {
            System.err.println("Ocurrió un error");
        }

    }
    
}
