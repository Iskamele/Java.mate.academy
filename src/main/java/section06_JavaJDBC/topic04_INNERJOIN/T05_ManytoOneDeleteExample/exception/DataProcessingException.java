package section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
