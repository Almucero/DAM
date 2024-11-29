import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testContarConsonantes_oso() {
        //arrange
        String palabra="oso";
        int resultadoEsperado=1;

        //act
        int resultadoReal = StringUtils.contarConsonantes(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testContarConsonantes_judio() {
        //arrange
        String palabra="judio";
        int resultadoEsperado=2;

        //act
        int resultadoReal = StringUtils.contarConsonantes(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testContarConsonantes_salchichon() {
        //arrange
        String palabra="salchichon";
        int resultadoEsperado=7;

        //act
        int resultadoReal = StringUtils.contarConsonantes(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
