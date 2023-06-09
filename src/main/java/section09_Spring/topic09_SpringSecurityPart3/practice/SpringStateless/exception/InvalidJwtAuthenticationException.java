package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.exception;

public class InvalidJwtAuthenticationException extends RuntimeException {
    public InvalidJwtAuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
