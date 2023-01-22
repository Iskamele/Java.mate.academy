package JavaCore.topic18_JavaJUnit.theory.T04_JUnitBestPractices.util;

import org.junit.jupiter.api.Test;
import section04_JavaCore.topic18_JavaJUnit.theory.T04_JUnitBestPractices.exceptions.ValidationException;
import section04_JavaCore.topic18_JavaJUnit.theory.T04_JUnitBestPractices.util.StringUtil;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilTest {
    StringUtil util = new StringUtil();

    /*
    Case 1

    @Test
    void nullValue_NotOk() {
        try {
            util.toUpperCase(null);
        } catch (ValidationException e) {
            return;
        }
        fail("ValidationException should be thrown if value is null");
    }
    */

    /*
    Case 1.2. Ещё один вариант работы с эксепшенами

    @Test
    void nullValue_NotOk() {
        try {
            util.toUpperCase(null);
        } catch (ValidationException e) {
            return;
        }
        fail("ValidationException should be thrown if value is null");
        assertThrows(ValidationException.class, () -> {
            util.toUpperCase(null);
        });
    }
     */

    // case 3

    @Test
    void nullValue_NotOk() {
        assertThrows(ValidationException.class, () -> {
            util.toUpperCase(null);
        });
    }
}