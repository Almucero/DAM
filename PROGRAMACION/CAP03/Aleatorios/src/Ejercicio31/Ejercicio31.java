package Ejercicio31;

public class Ejercicio31 {
    public static int tirarDados() {
        int dado1 = (int)(Math.random()*6)+1;
        int dado2 = (int)(Math.random()*6)+1;
        int sumaDados = dado1+dado2;
        System.out.printf("Dado 1: %d%nDado 2: %d%nSuma: %d%n", dado1, dado2, sumaDados);
        return sumaDados;
    }
    public static long pedirApuesta() {
        long apuesta;
        while (true) {
            try {
                System.out.print("Cuánto dinero quiere apostar? ");
                apuesta = Long.parseLong(System.console().readLine());
                if (apuesta>=1) {
                    break;
                }
                else {
                    System.out.println("Error. Debe de apostar algo de dinero para jugar\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return apuesta;
    }
    public static void main(String[] args) {
        System.out.println("""
            +-----------------------+
            | . C . R . A . P . S . |
            +-----------------------+
            """);
        long apuesta = pedirApuesta();
        int sumaDados = tirarDados();
        if (sumaDados==7 || sumaDados==11) {
            System.out.printf("¡Enhorabuena! ¡Ha ganado otros %d$!%n", apuesta);
            System.out.printf("¡Ahora tiene %d$!", apuesta*2);
        }
        else if (sumaDados==2 || sumaDados==3 || sumaDados==12) {
            System.out.println("Lo siento ha perdido todo su dinero.");
        }
        else {
            System.out.printf("Tiene que seguir tirando, debe conseguir el %d para ganar.%n", sumaDados);
            System.out.printf("Si obtiene un 7, perderá la partida.%n");
            System.out.printf("Pulse INTRO para tirar los dados%n");
            System.console().readLine();
            int objetivo = sumaDados;
            while (true) {
                sumaDados = tirarDados();
                if (sumaDados==objetivo) {
                    System.out.printf("¡Enhorabuena! ¡Ha ganado otros %d$!%n", apuesta);
                    System.out.printf("¡Ahora tiene %d$!", apuesta*2);
                    break;
                }
                else if (sumaDados==7) {
                    System.out.println("Lo siento ha perdido todo su dinero.");
                    break;
                }
                else {
                    System.out.printf("Continúe jugando.%n");
                    System.out.printf("Pulse INTRO para tirar los dados%n");
                    System.console().readLine();
                }
            }
        }
    }
}