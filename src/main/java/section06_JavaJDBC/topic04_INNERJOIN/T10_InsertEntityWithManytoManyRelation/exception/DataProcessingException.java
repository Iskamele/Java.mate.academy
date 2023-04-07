package section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
