package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
