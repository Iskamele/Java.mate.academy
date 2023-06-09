package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
