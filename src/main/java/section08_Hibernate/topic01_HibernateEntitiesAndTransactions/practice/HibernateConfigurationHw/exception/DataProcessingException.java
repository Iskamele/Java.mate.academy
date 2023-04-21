package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
