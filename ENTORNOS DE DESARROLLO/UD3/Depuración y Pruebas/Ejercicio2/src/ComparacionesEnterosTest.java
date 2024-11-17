import org.junit.Assert;
import org.junit.Test;

public class ComparacionesEnterosTest {
    @Test
    public void testSonIguales() {
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
    public void testEsMayor() {
        // Arrange or given
        int num1 = 5;
        int num2 = 2;
        boolean expectedResult = true;
        // Act or when
        boolean actualResult = ComparacionesEnteros.esMayor(num1, num2);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testEsMenor() {
        // Arrange or given
        int num1 = 5;
        int num2 = 2;
        boolean expectedResult = true;
        // Act or when
        boolean actualResult = ComparacionesEnteros.esMenor(num1, num2);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testEsDivisible() {
        // Arrange or given
        int num1 = 10;
        int num2 = 0;
        boolean expectedResult = false;
        // Act or when
        boolean actualResult = ComparacionesEnteros.esDivisible(num1, num2);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSonAmbosPares() {
        // Arrange or given
        int num1 = 5;
        int num2 = 2;
        boolean expectedResult = false;
        // Act or when
        boolean actualResult = ComparacionesEnteros.sonAmbosPares(num1, num2);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAlMenosUnoPositivo() {
        // Arrange or given
        int num1 = 5;
        int num2 = -2;
        boolean expectedResult = true;
        // Act or when
        boolean actualResult = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumaEsPar() {
        // Arrange or given
        int num1 = 5;
        int num2 = 2;
        boolean expectedResult = false;
        // Act or when
        boolean actualResult = ComparacionesEnteros.sumaEsPar(num1, num2);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
}