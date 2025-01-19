package Ejercicio2;

public class App {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        int opcion=0;
        int kilometros=0;

        do {
            System.out.print("""
                1. Anda con la bicicleta
                2. Haz el caballito con la bicicleta
                3. Anda con el coche
                4. Quema rueda con el coche
                5. Ver kilometraje de la bicicleta
                6. Ver kilometraje del coche
                7. Ver kilometraje total
                8. Salir
                """);
            System.out.print("Elige una opción (1-8): ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kiómetros quiere recorrer? ");
                    kilometros = Integer.parseInt(System.console().readLine());
                    bicicleta.recorrer(kilometros);
                    break;
                case 2:
                    bicicleta.caballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kiómetros quiere recorrer? ");
                    kilometros = Integer.parseInt(System.console().readLine());
                    coche.recorrer(kilometros);
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.print("La bicicleta lleva recorridos "+bicicleta.getKilometrosRecorridos()+" Km");
                    break;
                case 6:
                    System.out.print("El coche lleva recorridos "+coche.getKilometrosRecorridos()+" Km");
                    break;
                case 7:
                  System.out.println("Ambos vehículos llevan recorridos "+Vehiculo.getKilometrosTotales()+" Km en conjunto");
                    break;
                default:
                    break;
            }
        } while (opcion!=8);
    }
}