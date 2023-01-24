package section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.exceptions;

public class RegistrationException extends RuntimeException {
    public RegistrationException(String message) {
        super(message);
    }
}
