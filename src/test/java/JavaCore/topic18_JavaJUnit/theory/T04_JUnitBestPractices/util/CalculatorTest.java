package JavaCore.topic18_JavaJUnit.theory.T04_JUnitBestPractices.util;

import org.junit.jupiter.api.Test;
import section04_JavaCore.topic18_JavaJUnit.theory.T04_JUnitBestPractices.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void division_OK() {
        int a = 10;
        int b = 20;
        double actual = calculator.calculate(a, b, "/");
        double expected = 0.5;
        assertEquals(expected, actual);
    }
}