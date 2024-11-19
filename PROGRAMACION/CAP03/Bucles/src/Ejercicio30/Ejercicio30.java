package Ejercicio30;

public class Ejercicio30 {
    private static int solicitarDia() {
        int diaNumerico=0;
        boolean diaAceptado=false;
        while (diaAceptado!=true) {
            try {
                System.out.print("Día: ");
                String diaTexto = System.console().readLine();
                diaNumerico = switch(diaTexto.toLowerCase()) {
                    case "lunes"->1;
                    case "martes"->2;
                    case "miercoles", "miércoles"->3;
                    case "jueves"->4;
                    case "viernes"->5;
                    case "sabado", "sábado"->6;
                    case "domingo"->7;
                    default->0;
                };
                if (diaNumerico!=0) {
                    diaAceptado=true;
                }
                else {
                    System.out.println("Error. Debe introducir un día de la semana válido");
                    System.out.println("Las opciones posibles son: Lunes, Martes, Miércoles, Jueves, Viernes, Sábado y Domingo");
                    System.out.println();
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor valor válido");
                System.out.println();
            }
        }
        return diaNumerico;
    } 
    private static int solicitarHora() {
        int hora=0;
        boolean horaAceptada=false;
        while (horaAceptada!=true) {
            try {
                System.out.print("Hora: ");
                hora = Integer.parseInt(System.console().readLine());
                if (hora>=0 && hora<=24) {
                    horaAceptada=true;
                }
                else {
                    System.out.println("Debe introducir un rango horario válido");
                    System.out.println();
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor valor válido");
                System.out.println();
            }
        }
        return hora;
    }
    private static String diaSemanaDeNumATexto(int dia) {
        return switch(dia) {
            case 1->"Lunes";
            case 2->"Martes";
            case 3->"Miércoles";
            case 4->"Jueves";
            case 5->"Viernes";
            case 6->"Sábado";
            case 7->"Domingo";
            default->"";
        };
    }
    private static int horasTranscurridas(int dia, int horas) {
        return ((dia-1)*24)+horas;
    }
    public static void main(String[] args) {
        boolean cerrar=false;
        while (cerrar!=true) {
            try {
                System.out.println("Por favor, introduzca la primera hora");
                int diaIncial = solicitarDia();
                int horaInicial = solicitarHora();
                System.out.println("Por favor, introduzca la segunda hora");
                int diaFinal = solicitarDia();
                int horaFinal = solicitarHora();
                System.out.printf("Entre las %02d:00 del %s y las %02d:00 del %s hay %d hora/s", 
                    horaInicial, diaSemanaDeNumATexto(diaIncial), horaFinal, diaSemanaDeNumATexto(diaFinal), 
                    (horasTranscurridas(diaFinal, horaFinal)-horasTranscurridas(diaIncial, horaInicial)));
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}