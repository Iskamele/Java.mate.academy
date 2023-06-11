package section09_Spring.topic10_SpringTesting.practice.SpringTests.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
