package Ejercicio20;

public class Ejercicio20 {

    public static int cifras(int valor){
        valor = Math.abs(valor);
        if(valor < 10)
            return 1;
        else if (valor < 100)
            return 2;
        else if (valor < 1000)
            return 3;
        else if (valor < 10000)
            return 4;
        else if (valor < 100000)
            return 5;
        else
            return -1;
    }
    public static int obtenerPrimero(int valor){
        return valor / (int) Math.pow(10,cifras(valor)-1);
    }

    public static int obtenerUltimo(int valor){
        return valor % 10;
    }

    public static int quitarExtremos(int valor){
        switch(cifras(valor)){
            case 1:
                return 0;
                /**
                 * 1
                 * 0
                 */
            case 2:
                return 0;
                /**
                 * 10
                 *  0
                 */
            case 3:
                return (valor % 100)/10;
                /**
                 * 123 / 100
                 *  23   1
                 *  23 / 10
                 *       2
                 */
            case 4:
                return (valor % 1000)/10;
                /*
                 * 1234 / 1000
                 *  234   1
                 *  234 / 10
                 *    4   23
                 */
            case 5:
                return (valor % 10000)/10;
                /*
                 * 12345 / 10000
                 * 2345    1
                 * 2345  / 10
                 *         234
                 */
            default:
                return -1;
        }   
    }
    public static boolean esCapicua(Integer valor){
        if(valor==null){
            System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
            try {
                valor = Integer.parseInt(System.console().readLine());    
                
            } catch (Exception e) {
                System.err.println("Ocurrió un error");
                return false;
            }
            
        }
        valor = Math.abs(valor);
        switch(cifras(valor)){
            case 1:
                return true;
            case 2,3:
                return obtenerPrimero(valor)==obtenerUltimo(valor);
            case 4,5:
                return obtenerPrimero(valor)==obtenerUltimo(valor) && 
                    esCapicua(quitarExtremos(valor));
            default:
                return false;
        }
    }
}
