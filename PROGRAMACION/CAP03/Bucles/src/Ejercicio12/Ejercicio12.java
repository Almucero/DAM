package Ejercicio12;

public class Ejercicio12 { 
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra los n primeros números de la serie Fibonacci.");
        boolean cerrar=false;
        while (cerrar!=true) {
            System.out.print("Por favor, introduzca n: ");
            try {
                int n = Integer.parseInt(System.console().readLine());
                if (n<=0) {
                    System.out.println("Por favor, introduzca un número positivo mayor que 0");
                    System.out.println();
                }
                else {
                    int num1=0;
                    int num2=1;
                    for (int i=0; i<n; i++) {
                        if (i==n-1) {
                            System.out.print(num1 + ". ");
                        }
                        else {
                            System.out.print(num1 + ", ");
                        }
                        int temp = num1;
                        num1 = num2;
                        num2 = temp + num2;
                    }
                    System.out.println();
                    cerrar=true;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un número");
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}
