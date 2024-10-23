package Ejercicio11;
public class Ejercicio11{
    public static void segundosHastaMediaNoche(){
        System.out.println("""
                A continuación deberá introducir una hora del día, 
                primero introducirá la hora y luego los minutos.
                """);
        try {
            System.out.print("hora: ");
            int hora = Integer.parseInt(System.console().readLine());
            System.out.print("minuto: ");
            int minuto = Integer.parseInt(System.console().readLine());
            if(hora >=0 && hora <=23 && minuto >=0 && minuto <=59){
                int segundos = 24*3600 - hora*3600 - minuto*60;
                System.out.printf("""
                Desde las %02d:%02d hasta la medianoche faltan %d segundos.
                """, hora, minuto, segundos);
            }
            else
                System.out.println("Hora incorrecta");
        } catch (Exception e) {
            System.err.println("Ocurrió un error");
        }
    }
}