package lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinAndMaxTest {

    @Test
    void minNumberTest() {
        int actual = MinAndMax.minNumber(321, 400, 500, 698);
        int expected = 321;

        assertEquals(actual, expected);
    }

    @Test
    void maxNumberTest() {
        int actual = MinAndMax.maxNumber(321, 400, 500, 698, 594);
        int expected = 698;

        assertEquals(actual, expected);
    }
}