import java.util.Scanner;
import Calculos.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("|               -  CALCULADORA BÁSICA  -              |");
        System.out.println("|                                                     |");
        System.out.println("|  Introduce dos números y un operador (+, -, x, /)   |");
        System.out.println("|        Escribe 'q' como operador para salir         |");
        System.out.println();

        double operando1 = 0;
        while(true) {
            try {
                System.out.print("Introduce el primer operando: ");
                operando1 = Double.parseDouble(scanner.nextLine());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error: El operando debe ser un número válido");
                System.out.println();
            } 
        }
        Calculadora calculadora = new Calculadora(operando1);
       
        while (true) {
            try {
                System.out.print("Introduce el operador: ");
                String eleccion = scanner.nextLine();
                if (eleccion.length() !=1) {
                    throw new IllegalArgumentException("Error: Operador no válido. Usa solo +, -, x o /");
                }
                char operador = eleccion.charAt(0);
                calculadora.setOperador(operador);
                if (operador == 'q' || operador == 'Q') {
                    System.out.println("Saliendo de la calculadora");
                    System.out.println();
                    break;
                }

                System.out.print("Introduce el siguiente operando: ");
                double operando2 = Double.parseDouble(scanner.nextLine());
                calculadora.setOperando2(operando2);

                System.out.print(calculadora.getOperando1() + " " + operador + " " + operando2 + " = ");
                calculadora.calcular();
                System.out.println(calculadora.getOperando1());
                System.out.println();
            } 
            catch (NumberFormatException e) {
                System.out.println("Error: El operando debe ser un número válido");
                System.out.println();
            } 
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();
            } 
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
            }
        }
        scanner.close();
    }
}