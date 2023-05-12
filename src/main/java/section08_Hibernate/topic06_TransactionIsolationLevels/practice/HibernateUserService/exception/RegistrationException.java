package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.exception;

public class RegistrationException extends Exception {
    public RegistrationException(String message) {
        super(message);
    }
}
