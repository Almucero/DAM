import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    
    @Test
    public void reverse_word_amigo() {
        //arange
        String palabra="amigo";
        String resultadoEsperdo="ogima";

        //act
        String resultadoReal = StringUtils.reverseWord(palabra);

        //assert
        Assert.assertEquals(resultadoEsperdo, resultadoReal);
    }
}
