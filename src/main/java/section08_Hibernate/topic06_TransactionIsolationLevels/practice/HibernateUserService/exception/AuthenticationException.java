package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
