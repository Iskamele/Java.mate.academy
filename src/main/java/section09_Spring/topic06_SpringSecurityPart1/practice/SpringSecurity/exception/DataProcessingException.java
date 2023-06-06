package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
