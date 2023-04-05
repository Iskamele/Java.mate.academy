package section06_JavaJDBC.topic04_INNERJOIN.T01_RelationTypes.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
