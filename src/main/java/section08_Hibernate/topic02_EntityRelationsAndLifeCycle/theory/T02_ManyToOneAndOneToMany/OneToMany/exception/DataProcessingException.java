package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
