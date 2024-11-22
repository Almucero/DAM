import org.junit.Assert;
import org.junit.Test;

public class OperacionesMixtasTest {
    @Test
    public void testConcatenarNumeroTexto() {
        // Arrange or given
        int numero = 5;
        String texto = "manzanas";
        String expectedResult = "5 manzanas";
        // Act or when
        String actualResult = OperacionesMixtas.concatenarNumeroTexto(numero, texto);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testBooleanComoTexto() {
        // Arrange or given
        boolean valor = true;
        String expectedResult = "verdadero";
        // Act or when
        String actualResult = OperacionesMixtas.booleanComoTexto(valor);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testConcatenarTextos() {
        // Arrange or given
        String texto1 = "Hola";
        String texto2 = "Mundo";
        String expectedResult = "Hola Mundo";
        // Act or when
        String actualResult = OperacionesMixtas.concatenarTextos(texto1, texto2);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testDescripcionNumero() {
        // Arrange or given
        int numero = 10;
        String expectedResult = "El número es positivo";
        // Act or when
        String actualResult = OperacionesMixtas.descripcionNumero(numero);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCambiarTextoAMayusculas() {
        // Arrange or given
        String texto = "java";
        boolean aMayusculas = true;
        String expectedResult = "JAVA";
        // Act or when
        String actualResult = OperacionesMixtas.cambiarTextoAMayusculas(texto, aMayusculas);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testDescripcionConFloat() {
        // Arrange or given
        float valor1 = 3.14159f;
        float valor2 = 2.71828f;
        String expectedResult = "Los valores son: 3.14€ y 2.72€";
        // Act or when
        String actualResult = OperacionesMixtas.descripcionConFloat(valor1, valor2);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testFormatearNumero() {
        // Arrange or given
        float numero = 123.45678f;
        int decimales = 2;
        String expectedResult = "123.46";
        // Act or when
        String actualResult = OperacionesMixtas.formatearNumero(numero, decimales);
        // Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
}
