package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
