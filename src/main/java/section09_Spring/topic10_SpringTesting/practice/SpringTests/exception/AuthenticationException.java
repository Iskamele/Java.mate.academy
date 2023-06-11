package section09_Spring.topic10_SpringTesting.practice.SpringTests.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
