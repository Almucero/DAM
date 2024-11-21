import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverseWord() {
        //arrange
        String palabra="amigo";
        boolean resultadoEsperado=true;

        //act
        boolean resultadoReal = StringUtils.reverseWord(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
