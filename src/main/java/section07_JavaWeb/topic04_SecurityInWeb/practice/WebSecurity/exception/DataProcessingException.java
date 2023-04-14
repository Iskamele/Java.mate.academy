package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
