package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
