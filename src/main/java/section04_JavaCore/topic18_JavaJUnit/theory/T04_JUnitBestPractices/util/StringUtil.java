package section04_JavaCore.topic18_JavaJUnit.theory.T04_JUnitBestPractices.util;

import section04_JavaCore.topic18_JavaJUnit.theory.T04_JUnitBestPractices.exceptions.ValidationException;

public class StringUtil {
    public String toUpperCase(String string) throws ValidationException {
        /*
        Case 1

        if (string == null) {
            throw new ValidationException("String cannot be null!");
        }
        return string.toUpperCase();
         */

        /*
        Case 1.2. Ещё один вариант работы с эксепшенами

        if (string == null) {
            return null;
        }
        return string.toUpperCase();
         */

        // Case 3
        if (string == null) {
            throw new ValidationException("");
        }
        return string.toUpperCase();
    }
}
