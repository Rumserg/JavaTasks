package TestJU;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyJUnitCaseTest {

    @Test
    void alphabet() {
        Assertions.assertEquals(26, alphabet());
    }
}