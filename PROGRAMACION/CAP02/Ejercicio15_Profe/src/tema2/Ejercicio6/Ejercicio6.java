package tema2.Ejercicio6;

public class Ejercicio6 {
    public static void ejercicio6(){
        double baseImponible = 22.75;
        final double IVA = 0.21;
        double iva = baseImponible*IVA;
        double total = baseImponible + iva;
        System.out.printf("Base imponible %.2f%n", baseImponible);
        System.out.printf("IVA %.2f%n", iva);
        System.out.println("-----------");
        System.out.printf("Total %.2f%n", total);

    }
    
}
