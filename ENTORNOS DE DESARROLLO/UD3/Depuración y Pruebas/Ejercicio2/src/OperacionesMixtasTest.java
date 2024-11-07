import org.junit.Assert;
import org.junit.Test;

public class OperacionesMixtasTest {
    @Test
    public void testConcatenarNumeroTexto() {
        // Arrange or given
        int num1 = 2;
        int num2 = 2;
        boolean expectedResult = true;

        // Act or when
        boolean actualResult = ComparacionesEnteros.sonIguales(num1, num2);

        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBooleanComoTexto() {
        // Arrange or given
        int num1 = 2;
        int num2 = 2;
        boolean expectedResult = true;

        // Act or when
        boolean actualResult = ComparacionesEnteros.sonIguales(num1, num2);

        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConcatenarTextos() {
        // Arrange or given
        int num1 = 2;
        int num2 = 2;
        boolean expectedResult = true;

        // Act or when
        boolean actualResult = ComparacionesEnteros.sonIguales(num1, num2);

        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDescripcionNumero() {

    }

    @Test
    public void testCambiarTextoAMayusculas() {

    }

    @Test
    public void testDescripcionConFloat() {

    }

    @Test
    public void testFormatearNumero() {

    }
}
