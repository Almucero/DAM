import org.junit.Assert;
import org.junit.Test;

public class EvaluacionUnidad3Test {

    //Ejercicio 1 ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testSumaEdades_20_y_7() {

        //Arrange
        int edad1 = 20;
        int edad2 = 7;
        boolean expectedResult = true;

        //Act
        boolean actualResult = EvaluacionUnidad3.sumaEdades(edad1, edad2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumaEdades_25_y_10() {

        //Arrange
        int edad1 = 25;
        int edad2 = 10;
        boolean expectedResult = true;

        //Act
        boolean actualResult = EvaluacionUnidad3.sumaEdades(edad1, edad2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumaEdades_17_y_15() {

        //Arrange
        int edad1 = 17;
        int edad2 = 15;
        boolean expectedResult = true;

        //Act
        boolean actualResult = EvaluacionUnidad3.sumaEdades(edad1, edad2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumaEdades_40_y_89() {

        //Arrange
        int edad1 = 40;
        int edad2 = 89;
        boolean expectedResult = false;

        //Act
        boolean actualResult = EvaluacionUnidad3.sumaEdades(edad1, edad2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    //Ejercicio2 ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testsonMayores_7_y_9() {

        //Arrange
        int num1 = 7;
        int num2 = 9;
        String expectedResult = "ambos son mayores que 5";

        //Act
        String actualResult = EvaluacionUnidad3.sonMayores(num1, num2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testsonMayores_2_y_6() {

        //Arrange
        int num1 = 2;
        int num2 = 6;
        String expectedResult = "el segundo número es mayor que 5";

        //Act
        String actualResult = EvaluacionUnidad3.sonMayores(num1, num2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testsonMayores_9_y_1() {

        //Arrange
        int num1 = 9;
        int num2 = 1;
        String expectedResult = "el primer número es mayor que 5";

        //Act
        String actualResult = EvaluacionUnidad3.sonMayores(num1, num2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testsonMayores_1_y_2() {

        //Arrange
        int num1 = 1;
        int num2 = 2;
        String expectedResult = "ninguno es mayor que 5";

        //Act
        String actualResult = EvaluacionUnidad3.sonMayores(num1, num2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    //Ejercico3 ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testCuentaVocales_Viva_Ceuta() {

        //Arrange
        String frase = "Viva ceuta";
        int expectedResult = 5;

        //Act
        int actualResult = EvaluacionUnidad3.cuentaVocales(frase);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testCuentaVocales_Unió_calma_y_pasión() {

        //Arrange
        String frase = "Unió calma y pasión";
        int expectedResult = 8;

        //Act
        int actualResult = EvaluacionUnidad3.cuentaVocales(frase);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testCuentaVocales_Nlñkjnvcdwszxd() {

        //Arrange
        String frase = "Nlñkjnvcdwstrwszxd";
        int expectedResult = 0;

        //Act
        int actualResult = EvaluacionUnidad3.cuentaVocales(frase);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testCuentaVocales_Los_torbellinos_sucios_vomitaban_sin_compasión_ni_Perú() {

        //Arrange
        String frase = "Los torbellinos sucios vomitaban sin compasión ni Perú";
        int expectedResult = 20;

        //Act
        int actualResult = EvaluacionUnidad3.cuentaVocales(frase);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
}
