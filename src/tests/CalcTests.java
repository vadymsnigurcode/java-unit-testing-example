package tests;

import com.calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;


public class CalcTests {

    @Test
    public void SumTest() {
        Calculator calc = new Calculator();
        int resultActual = calc.sum(1,2);
        Assert.assertEquals(resultActual, 3);
    }
}
