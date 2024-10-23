package Ejercicio2;

public class Ejercicio2 {
    public static String saluda(){
        System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
        try {
            int hora = Integer.parseInt(System.console().readLine());    
            if(hora>=0 && hora <= 23){
                return switch(hora){
                    case 6,7,8,9,10,11,12->"Buenos días";
                    case 13,14,15,16,17,18,19,20->"Buenas tardes";
                    default->"Buenas noches";
                };
            }
            return "Hora incorrecta";
        } catch (Exception e) {
            return "Ocurrió un error";
        }
        
    }
}
