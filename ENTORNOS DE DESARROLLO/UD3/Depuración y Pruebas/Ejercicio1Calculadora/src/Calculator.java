public class Calculator {
    
    public String nombre = "";

    public int suma(int sumando1, int sumando2) {
        int resultado = sumando1 + sumando2;
        return resultado;
    }
    public int resta(int minuendo, int sustraendo) {
        int resultado = minuendo - sustraendo;
        return resultado;
    }
    public int multiplicacion(int multiplicando1, int multiplicando2) {
        int resultado = multiplicando1 * multiplicando2;
        return resultado;
    }
    public int division(int dividendo, int divisor) {
        int resultado = dividendo / divisor;
        return resultado;
    }
}
