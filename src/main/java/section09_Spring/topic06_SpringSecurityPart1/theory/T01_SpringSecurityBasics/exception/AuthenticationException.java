package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
