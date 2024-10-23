package Ejercicio22;

public class Ejercicio22 {
    /**
     * solicitaDia
     * Solicita el día en formato de texto
     * Ej: "lunes", "MARTES", ...
     * @return el día introducido por teclado
     */
    public static String solicitaDia(){
        System.out.println("Por favor, introduzca un día de la semana (de lunes a viernes): ");
        return System.console().readLine();
    }

    /**
     * solicitaHora
     * Pide la hora por teclado
     * @return la hora introducidos
     */
    public static int solicitaHora(){
        System.out.print("Hora: ");
        return Integer.parseInt(System.console().readLine());
    }

    /**
     * solicitaMinutos
     * Pide los minutos por teclado
     * @return los minutos introducidos
     */
    public static int solicitaMinutos(){
        System.out.print("Minutos: ");
        return Integer.parseInt(System.console().readLine());
    }

    /**
     * diaSemana
     * Devuelve el día número de la semana dado un día en formato texto
     * Ej: "lunes"->1, "martes"->2 ...
     * @param dia día en formato string
     * @return el valor númerico asociado al día de la semana
     */
    public static int diaSemana(String dia){
        return switch(dia.toUpperCase()){
            case "LUNES"->1;
            case "MARTES"->2;
            case "MIÉRCOLES","MIERCOLES"->3;
            case "JUEVES"->4;
            case "VIERNES"->5;
            case "SÁBADO","SABADO"->6;
            case "DOMINGO"->7;
            default->-1;
        };
    }

    /**
     * minutosHastaElLunes
     * calcula los minutos transcurridos desde las 0:00 horas del día
     * indicado
     * @param dia día a partir del cual se calculan los minutos
     * @return los minutos transcurridos
     */
    public static int minutosHastaElLunes(String dia){
        return (diaSemana(dia)-1)*24*60;
    }

    /**
     * minutosHora
     * Devuelve los minutos transcurridos en un día a partir
     * de una hora y minutos indicados
     * @param hora Hora desde la cual calcular los minutos
     * @param minutos minutos desde los cuales calculos los minutos
     * @return devuelve los minutos hasta las 00:00 del día
     */
    public static int minutosHora(int hora, int minutos){
        return hora*60+minutos;
    }

    /**
     * minutosSemana
     * @return los minutos de una semana completa
     */
    public static int minutosSemana(){
        return 7*24*60;
    }

    /**
     * minutosHastaFinDeSemana
     * Calcula los minutos desde el día y hora actual hasta el siguiente
     * viernes a las 15:00
     */
    public static void minutosHastaFinDeSemana(){
        try {
            String dia = solicitaDia();
            System.out.println("A continuación introduzca la hora (hora y minutos)");
            int hora = solicitaHora();
            int minutos = solicitaMinutos();  
            int minutosHastaElViernes = minutosHastaElLunes("viernes") + minutosHora(15,0);
            int horaACalcular = minutosHastaElLunes(dia) + minutosHora(hora, minutos);
            int minutosSemana = minutosSemana();
            if(minutosHastaElViernes >= horaACalcular){
                System.out.printf("Faltan %d minutos para llegar al fin de semana.",
                                  minutosHastaElViernes - horaACalcular); 
            }
            else{
                System.out.printf("Faltan %d minutos para llegar al fin de semana.",
                                 (minutosSemana - horaACalcular) + minutosHastaElViernes);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error");
        }
        
    }
}
