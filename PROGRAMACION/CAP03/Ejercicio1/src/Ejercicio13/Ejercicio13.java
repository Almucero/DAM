package Ejercicio13;

public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        int positivos=0;
        int negativos=0;
        System.out.println("Por favor, introduzca 10 números enteros:");
        for (int i=0; i<10; i++) {
            boolean cerrar=false;
            while(cerrar!=true){
                try {
                    int num = Integer.parseInt(System.console().readLine());
                    if (num>=0) {
                        positivos++;
                        cerrar=true;
                    }
                    else {
                        negativos++;
                        cerrar=true;
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Error. Debe introducir un número entero");
                    System.out.println();
                }
                catch (Exception e) {
                    System.out.println("Ocurrió un error inesperado");
                    break;
                }
            }
        }
        System.out.println("Ha introducido "+positivos+" positivos y "+negativos+" negativos.");
    }
}
