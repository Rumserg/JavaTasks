package TestJU;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyJUnitCaseTest {

    @Test
    void alphabetTest() {
        MyJUnitCase myjunitcase = new MyJUnitCase();
        int result = myjunitcase.alphabet().size();
        int expected = 23;
        Assert.assertEquals(result, expected);
    }
}