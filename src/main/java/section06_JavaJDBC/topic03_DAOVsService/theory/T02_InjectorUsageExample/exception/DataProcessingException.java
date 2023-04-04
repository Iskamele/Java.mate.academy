package section06_JavaJDBC.topic03_DAOVsService.theory.T02_InjectorUsageExample.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
