package Ejercicio32;

public class Ejercicio32 {
    public static void posicionSendero(int posicion) {
        String espacios="";
        int aleatorio = (int)(Math.random()*3)+1;
        switch (aleatorio) {
            case 2-> posicion += 1;
            case 3-> posicion -= 1;
        };
        for (int i=1; i<=posicion; i++) {
            espacios += " ";
        }
        System.out.print(espacios);
    }
    public static void rellenoSendero() {
        String obstaculo=" ";
        int aleatorio = (int)(Math.random()*2)+1;
        int aleatorio2 = (int)(Math.random()*2)+1;
        int aleatorio3 = (int)(Math.random()*4)+1;
        switch (aleatorio) {
            case 1-> {
                switch (aleatorio2) {
                    case 1-> obstaculo="*";
                    case 2-> obstaculo="0";
                }
            }
        }
        switch (aleatorio3) {
            case 1-> System.out.printf("|%s   |%n", obstaculo);
            case 2-> System.out.printf("| %s  |%n", obstaculo);
            case 3-> System.out.printf("|  %s |%n", obstaculo);
            case 4-> System.out.printf("|   %s|%n", obstaculo);
        };
    }
    public static int pedirLongitud() {
        int longitud;
        while (true) {
            try {
                System.out.print("Introduzca la longitud del sendero en metros: ");
                longitud = Integer.parseInt(System.console().readLine());
                if (longitud>=1) {
                    break;
                }
                else {
                    System.out.println("Error. La longitud del sendero debe ser como mínimo 1\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return longitud;
    }
    public static void main(String[] args) {
        try {
            int longitud = pedirLongitud();
            int posicion=7; //posición = numEspaciosIzquierda, distinto en el primero
            System.out.print("       "); //7 espacios iniciales
            rellenoSendero();
            for (int i=1; i<=longitud-1; i++) { //se resta 1 ya que la primera longitud se hace manualmente
                posicionSendero(posicion);
                rellenoSendero();
            }
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: "+e);
        }
    }
}