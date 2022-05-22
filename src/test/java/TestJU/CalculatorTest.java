package TestJU;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void summaTest() {
        Calculator calculator = new Calculator();
        int result = calculator.summa(4,5);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}