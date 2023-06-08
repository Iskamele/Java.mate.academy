package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
