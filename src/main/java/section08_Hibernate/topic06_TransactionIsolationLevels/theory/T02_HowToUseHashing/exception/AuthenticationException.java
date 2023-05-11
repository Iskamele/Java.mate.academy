package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.exception;

public class AuthenticationException extends RuntimeException  {
    public AuthenticationException(String message) {
        super(message);
    }
}
