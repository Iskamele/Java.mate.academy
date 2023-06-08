package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
