package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
