package operaciones;

public class operaciones {

    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int restar(int a, int b) {
        return sumar(a,-b);
    }
    public static int multiplicar(int a, int b) {
        int resultado=0;
        for(int contador=0; contador<b;contador++){
            resultado = resultado+a;
        }
        return resultado;
    }
    public static int dividir(int a, int b) throws Exception {
        if (b==0) {
            throw new Exception("No se puede dividir entre 0");
        }
        int contador = 0;
        while(a>=b) {
            a = restar(a, b);
            contador++;
        }
        return contador;
    }
    public static int resto(int a, int b) throws Exception {
        if(b==0) {
            throw new Exception("No se puede dividir entre 0");
        }
        while(a>=b) {
            a = restar(a, b);
        }
        return a;
    }
    public static int potencia(int a, int b) throws Exception {
        if(b==0) {
            return 1;
        }
        else if (b>0) {
            int potencia = 1;
            for(int contador=0; contador<b; contador++)
                potencia = multiplicar(potencia, a);
            return potencia;
        }
        else {
            try {
                return dividir(1, potencia(a, -b));
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
