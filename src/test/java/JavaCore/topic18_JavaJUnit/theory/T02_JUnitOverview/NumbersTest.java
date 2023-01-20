package JavaCore.topic18_JavaJUnit.theory.T02_JUnitOverview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    void demo() {
        boolean actualBoolean1 = true;
        assertTrue(actualBoolean1);

        boolean actualBoolean2 = false;
        assertFalse(actualBoolean2, "Error! Custom message assert true!");

        int expected = 10;
        int actual = 10;
        assertEquals(expected, actual, "Error! Custom message");

        int expected2 = 10;
        int actual2 = 11;
        assertNotEquals(expected2, actual2);

        assertNull(null);
    }
}