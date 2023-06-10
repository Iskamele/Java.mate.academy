package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
