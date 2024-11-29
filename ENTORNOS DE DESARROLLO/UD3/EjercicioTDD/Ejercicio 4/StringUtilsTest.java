import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testEsSoloMayusculas_CARAMBANO() {
        //arrange
        String palabra="CARAMBANO";
        boolean resultadoEsperado=true;

        //act
        boolean resultadoReal = StringUtils.esSoloMayusculas(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testEsSoloMayusculas_Payaso() {
        //arrange
        String palabra="Payaso";
        boolean resultadoEsperado=false;

        //act
        boolean resultadoReal = StringUtils.esSoloMayusculas(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testEsSoloMayusculas_ANTIdoto() {
        //arrange
        String palabra="ANTIdoto";
        boolean resultadoEsperado=false;

        //act
        boolean resultadoReal = StringUtils.esSoloMayusculas(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
