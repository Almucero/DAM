import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverseWord_amigo() {
        //arrange
        String palabra="amigo";
        String resultadoEsperado="ogima";

        //act
        String resultadoReal = StringUtils.reverseWord(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testReverseWord_perro() {
        //arrange
        String palabra="perro";
        String resultadoEsperado="orrep";

        //act
        String resultadoReal = StringUtils.reverseWord(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testReverseWord_ornitorrinco() {
        //arrange
        String palabra="ornitorrinco";
        String resultadoEsperado="ocnirrotinro";

        //act
        String resultadoReal = StringUtils.reverseWord(palabra);
        
        //assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}