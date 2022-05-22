package TestJU;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void summa() {
        Calculator calculator = new Calculator();
        int result = calculator.summa(3,5);
        if (result != 8) {
            System.out.println("Wrong!");
        }
            else System.out.println("Right");
    }
}