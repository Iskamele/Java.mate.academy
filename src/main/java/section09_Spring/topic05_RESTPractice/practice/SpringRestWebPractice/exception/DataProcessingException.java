package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
