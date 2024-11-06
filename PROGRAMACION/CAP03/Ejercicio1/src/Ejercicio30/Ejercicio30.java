package Ejercicio30;

public class Ejercicio30 {
    public static int solicitarMomento() {
        System.out.print("Día: ");
        int dia=0;
        boolean diaValido=false;
        while (diaValido!=true) {
            try {
                String diaSemana = System.console().readLine();
                dia = switch (diaSemana.toLowerCase()) {
                    case "lunes"->1;
                    case "martes"->2;
                    case "miercoles", "miércoles"->3;
                    case "jueves"->4;
                    case "viernes"->5;
                    case "sabado", "sábado"->6;
                    case "domingo"->7;
                    default->0;
                }
                diaValido = dia!=0;
            }
            catch (Exception e) {

            }
            finally {
                if (diaValido!=true) {
                    S
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Por favor introduzca la primera hora.");
    }
}
