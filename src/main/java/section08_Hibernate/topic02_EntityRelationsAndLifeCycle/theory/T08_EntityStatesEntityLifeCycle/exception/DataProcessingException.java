package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
