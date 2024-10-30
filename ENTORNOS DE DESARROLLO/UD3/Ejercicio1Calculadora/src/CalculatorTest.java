import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    @Test
    public void testSuma_2_y_3() {
        /*
         * Usar un assert
         * 
         * Los assert son métodos que trae la librería
         * JUnit que permiten comprobar si el resultado
         * es correcto.
         * 
         * en el caso de la función suma, comparamos el
         * resultado que esperamos con el resultado que
         * realmente devuelve la función
         */

        //
        int sumando1 = 2;
        int sumando2 = 3;
        int resultadoEsperado = 5;

        Calculator calculator = new Calculator();

        //
        int resultadoReal = calculator.suma(sumando1, sumando2);

        //
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
    @Test
    public void testSuma_12_y_menos7() {

        //
        int sumando1 = 12;
        int sumando2 = -7;
        int resultadoEsperado = 5;

        Calculator calculator = new Calculator();

        //
        int resultadoReal = calculator.suma(sumando1, sumando2);

        //
        Assert.assertEquals(resultadoEsperado, resultadoReal);
        
    }
    @Test
    public void resta() {

        //
        int minuendo = 12;
        int sustraendo = 5;
        int resultadoEsperado = 7;

        Calculator calculator = new Calculator();

        //
        int resultadoReal = calculator.resta(minuendo, sustraendo);

        //
        Assert.assertEquals(resultadoEsperado, resultadoReal);
        
    }
    @Test
    public void multiplicacion() {

        //
        int multiplicando1 = 12;
        int multiplicando2 = 5;
        int resultadoEsperado = 60;

        Calculator calculator = new Calculator();

        //
        int resultadoReal = calculator.multiplicacion(multiplicando1, multiplicando2);

        //
        Assert.assertEquals(resultadoEsperado, resultadoReal);
        
    }
    @Test
    public void division() {

        //
        int dividendo = 30;
        int divisor = 3;
        int resultadoEsperado = 10;

        Calculator calculator = new Calculator();

        //
        int resultadoReal = calculator.division(dividendo, divisor);

        //
        Assert.assertEquals(resultadoEsperado, resultadoReal);
        
    }
}