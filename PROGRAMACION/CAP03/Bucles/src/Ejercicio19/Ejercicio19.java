package Ejercicio19;

public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        int altura=0;
        char caracter=0;
        boolean alturaValida=false;
        boolean caracterValido=false;
        boolean cerrar=false;
        while (cerrar!=true) {
            try {
                while (alturaValida!=true) {
                    try {
                        System.out.print("Por favor, introduzca la altura de la pirámide: ");
                        altura = Integer.parseInt(System.console().readLine());
                        alturaValida=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido para la altura");
                        System.out.println();
                    }
                }
                while (caracterValido!=true) {
                    try {
                        System.out.print("Introduzca el carácter de relleno: ");
                        String caracterString = System.console().readLine();
                        if (caracterString.length()==1) {
                            caracter = caracterString.charAt(0);
                            caracterValido = true;
                        } else {
                            System.out.println("Error. Debe introducir solo un carácter");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido para el carácter");
                        System.out.println();
                    }
                }
                for (int fila=1; fila<=altura; fila++) {
                    for (int espacios=1; espacios<=(altura-fila); espacios++) {
                        System.out.print(" ");
                    }
                    for (int simbolos=1; simbolos<=(2*fila-1); simbolos++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}