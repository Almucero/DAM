import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverseWord() {
        //arrange
        String palabra="reconocer";
        boolean resultadoEsperado=true;

        //act
        boolean resultadoReal = StringUtils.reverseWord(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
