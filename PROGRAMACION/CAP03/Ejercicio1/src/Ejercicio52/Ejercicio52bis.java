package Ejercicio52;

public class Ejercicio52bis {
    public static int moverDigitos(int num) {
        int digitoFinal=num/(int)Math.pow(10, longitud(num)-1);
        int numVolteado=voltear(num);
        numVolteado=numVolteado/10;
        num=voltear(numVolteado)*10+digitoFinal;
        return num;
    }
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
    public static void main(String[] args) {
        boolean cerrar=false;
        boolean numAceptaddo=false;
        String numStr="";
        int num=0;
        int resultado=0;
        while (cerrar!=true) {
            try {
                while (numAceptaddo!=true) {
                    try {
                        System.out.print("Introduzca un número: ");
                        numStr = System.console().readLine();
                        num = Integer.parseInt(numStr);
                        numAceptaddo=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido");
                        System.out.println();
                    }
                }

                if (numStr.charAt(0)=='0') {
                    resultado = moverDigitos(num);
                    System.out.printf("%d", resultado);
                }
                if (numStr.charAt(1)=='0') {
                    resultado = moverDigitos(num);
                    System.out.printf("%0"+longitud(num)+"d", resultado);
                }




                
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                cerrar=true;
            }
        }
    }
}