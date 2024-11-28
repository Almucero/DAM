import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void palindromo_reconocer() {
        //arrange
        String palabra="reconocer";
        boolean resultadoEsperado=true;

        //act
        boolean resultadoReal = StringUtils.palindromo(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void palindromo_meteorito() {
        //arrange
        String palabra="meteorito";
        boolean resultadoEsperado=false;

        //act
        boolean resultadoReal = StringUtils.palindromo(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void palindromo_oso() {
        //arrange
        String palabra="oso";
        boolean resultadoEsperado=true;

        //act
        boolean resultadoReal = StringUtils.palindromo(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
