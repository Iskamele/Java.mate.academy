package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
