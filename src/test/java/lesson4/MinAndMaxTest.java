package lesson4;

import TestJU.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MinAndMaxTest {

    @Test
    void minNumberTest() {

        int actual = MinAndMax.minNumber(321, 400, 500, 698);
        int expected = 321;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void maxNumberTest() {
        int actual = MinAndMax.maxNumber(321, 400, 500, 698, 594);
        int expected = 698;

        Assert.assertEquals(actual, expected);
    }

}