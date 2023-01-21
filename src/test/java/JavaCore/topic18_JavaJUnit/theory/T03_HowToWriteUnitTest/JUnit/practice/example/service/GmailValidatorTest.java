package JavaCore.topic18_JavaJUnit.theory.T03_HowToWriteUnitTest.JUnit.practice.example.service;

import org.junit.jupiter.api.Test;
import section04_JavaCore.topic18_JavaJUnit.theory.T03_HowToWriteUnitTest.JUnit.practice.example.service.EmailValidator;
import section04_JavaCore.topic18_JavaJUnit.theory.T03_HowToWriteUnitTest.JUnit.practice.example.service.GmailValidator;

import static org.junit.jupiter.api.Assertions.*;

class GmailValidatorTest {
    // 1. Only gmail.com mails are valid
    // 2. '@' should be present
    // 3. numbers, special symbols and lowercase letters are allowed only
    // 4. email should start from letter

    private EmailValidator emailValidator = new GmailValidator();

    @Test
    void emailContainsSpecialSymbol_Ok() {
        String email = "valid@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertTrue(actual);
    }

    @Test
    void emailContainsSpecialSymbol_NotOk() {
        String email = "invalidgmail.com";
        boolean actual = emailValidator.isValid(email);
        assertFalse(actual);
    }

    @Test
    void containsGmailDomain_Ok() {
        String email = "valid@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertTrue(actual);
    }

    @Test
    void startWithNumber_NotOk() {
        String email = "456@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertFalse(actual);
    }

    @Test
    void startWithSymbol_NotOk() {
        String email = "$hello@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertFalse(actual);
    }

    @Test
    void containsSymbolsAndLatter_Ok() {
        String email = "val456$id@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertTrue(actual);
    }

    @Test
    void nullValue_NotOk() {
        assertThrows(NullPointerException.class, () -> {
            emailValidator.isValid(null);
        });
    }
}
