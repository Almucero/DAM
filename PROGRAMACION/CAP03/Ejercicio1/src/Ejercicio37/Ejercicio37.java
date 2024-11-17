package Ejercicio37;

public class Ejercicio37 { 
    public static int longitud(int num) {
        int longitudNum=0;
        while (num!=0) {
            num = num/10;
            longitudNum++;
        }
        return longitudNum;
    }
    public static int voltear(int num) {
        int numVolteado=0;
        while (num!=0) {
            numVolteado = (numVolteado*10)+(num%10);
            num = num/10;
        }
        return numVolteado;
    }
    public static void main(String[] args) throws Exception {
        boolean cerrar=false;
        boolean numValido=false;
        int num=0;
        while (cerrar!=true) {
            try {
                while (numValido!=true) {
                    try {
                        System.out.print("Por favor, introduzca un número entero positivo: ");
                        num = Integer.parseInt(System.console().readLine());
                        if (num>=0) {
                            numValido=true;
                        }
                        else {
                            System.out.println("Error. Debe introducir un número entero positivo");
                            System.out.println();
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                    int numVolteado = voltear(num*10+1);
                    int longitudNum = longitud(numVolteado);
                    System.out.printf("El %d en decimal es el ", num);
                    for (int i=1; i<longitudNum; i++) {
                        for (int j=1; j<=numVolteado%10; j++) {
                            System.out.print("| ");
                        }
                        if (i!=longitudNum-1) {
                            System.out.print("- ");
                        }
                        numVolteado = numVolteado/10;
                    }
                    System.out.printf("en el sistema de palotes");
                    cerrar=true;
                }
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}