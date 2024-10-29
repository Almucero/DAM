package Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        try {
        System.out.println("\033[1m"+"CALCULADORA DE MEDIDAS IMPERIALES"+"\033[0m");
        System.out.println("=================================");
        System.out.print("Introduce una cantidad en litros: ");
        double litro = Double.parseDouble(System.console().readLine());
        System.out.printf("\033[4m"+"%.2f"+"\033[0m"+" litros son: %n", litro);

        double Galones = litro/3.78541;
        double CuartosDeGalon = Galones*4;
        double pintas = litro/0.473176;
        double onzasLiquidas = litro/0.0295735;

        System.out.printf("\033[43m"+"%.2f"+"\033[0m"+" galones (gal)%n", Galones);
        System.out.printf("\033[42m"+"%.2f"+"\033[0m"+" cuartos de galón (qt)%n", CuartosDeGalon);
        System.out.printf("\033[41m"+"%.2f"+"\033[0m"+" pintas (pt)%n", pintas);
        System.out.printf("\033[46m"+"%.2f"+"\033[0m"+" onzas líquidas (fl oz)%n", onzasLiquidas);
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca el valor adecuado");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
