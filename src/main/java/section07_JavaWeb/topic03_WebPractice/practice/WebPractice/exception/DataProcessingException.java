package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
