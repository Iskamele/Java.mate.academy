package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
