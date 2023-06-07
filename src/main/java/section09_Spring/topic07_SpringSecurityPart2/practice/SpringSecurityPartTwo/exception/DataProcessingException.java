package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
