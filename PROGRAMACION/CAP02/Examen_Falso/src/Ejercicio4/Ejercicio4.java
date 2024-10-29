package Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        try {
        System.out.println("CALCULADORA DE MEDIDAS IMPERIALES");
        System.out.println("=================================");
        System.out.print("Introduce una cantidad en litros: ");
        double litros = Double.parseDouble(System.console().readLine());
        System.out.printf("%.4f litros son: %n", litros);
        double galones = litros/3.78541;
        double cuartosDeGalon = litros/0.946353;
        double pintas = litros/0.473176;
        double onzasLiquidas = litros/0.0295735;
        System.out.printf("%.2f galones (gal)%n",galones);
        System.out.printf("%.2f cuartos de galon (qt)%n",cuartosDeGalon);
        System.out.printf("%.2f pintas (pt)%n",pintas);
        System.out.printf("%.2f onzas líquidas (fl oz)%n",onzasLiquidas);
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
