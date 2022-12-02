package section04_JavaCore.topic06_Exceptions.practice.PasswordValidation;

import java.io.IOException;

public class PasswordValidationException extends IOException {
    public PasswordValidationException(String message) {
        super(message);
    }
}
