package tema3;

public class Ejercicio5 {
    public static double leerDouble(){
        return Double.parseDouble(System.console().readLine());
    }
    public static void ejercicio5(){
        try {
            System.out.println("Área de un rectángulo");
            System.out.println("---------------------");
            System.out.print("Por favor, introduzca la longitud de la base (cm): ");
            double base = leerDouble();
            System.out.print("Introduzca la altura (cm): ");
            double altura = leerDouble();
            System.out.printf("El área del rectángulo es %.1f cm2%n", base*altura);
        } catch(NumberFormatException e){
            System.out.println("Debe introducir un número");
        } catch (Exception e) {
            System.out.println("Ocurrión un error inesperado");
        }
        
    }
    
}
