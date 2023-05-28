package section09_Spring.topic04_REST.practice.SpringRest.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
