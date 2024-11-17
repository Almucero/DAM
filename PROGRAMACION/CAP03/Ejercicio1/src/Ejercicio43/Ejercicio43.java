package Ejercicio43;

public class Ejercicio43 {
    public static long longitud(long num) {
        long longitudNum=0;
        while (num!=0) {
            num = num/10;
            longitudNum++;
        }
        return longitudNum;
    }
    public static long voltear(long num) {
        long numVolteado=0;
        while (num!=0) {
            numVolteado = (numVolteado*10)+(num%10);
            num = num/10;
        }
        return numVolteado;
    }
    public static void main(String[] args) {
        boolean cerrar=false;
        boolean numAceptado=false;
        boolean posicionAceptada=false;
        long num=0;
        int posicionElegida=0;
        int posicionActual=0;
        long mitad1=0;
        long mitad2=0;
        while (cerrar!=true) {
            try {
                while (numAceptado!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número entero positivo: ");
                        num = Long.parseLong(System.console().readLine());
                        if (num>=0) {
                            if (longitud(num)>=2) {
                                numAceptado=true;
                            }
                            else {
                                System.out.println("Error. El número introducido debe tener al menos 2 cifras");
                                System.out.println();
                            }
                        }
                        else {
                            System.out.println("Error. El número introducido debe ser positivo");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                while (posicionAceptada!=true) {
                    try {
                        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
                        posicionElegida = Integer.parseInt(System.console().readLine());
                        if (posicionElegida>=2 && posicionElegida<=longitud(num)) {
                            posicionAceptada=true;
                        }
                        else {
                            System.out.println("Error. La posición debe ser como mínimo 2 y no puede ser mayor que la longitud del número");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }
                long numVolteado = voltear(num*10+1);
                while (numVolteado!=0) {
                    long digito = numVolteado%10;
                    if (posicionActual<posicionElegida) {
                        mitad1 = mitad1*10+digito;
                    }
                    else {
                        mitad2 = mitad2*10+digito;
                    }
                    numVolteado = numVolteado/10;
                    posicionActual++;
                }
                mitad2 = mitad2/10;
                System.out.printf("Los números partidos son el %d y el %d", mitad1, mitad2);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}