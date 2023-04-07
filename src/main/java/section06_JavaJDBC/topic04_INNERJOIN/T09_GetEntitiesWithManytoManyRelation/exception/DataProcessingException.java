package section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
