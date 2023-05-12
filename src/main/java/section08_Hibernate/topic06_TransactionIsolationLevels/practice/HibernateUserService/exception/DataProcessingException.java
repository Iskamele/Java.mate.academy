package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
