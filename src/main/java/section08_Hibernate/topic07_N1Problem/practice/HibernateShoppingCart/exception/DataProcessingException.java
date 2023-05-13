package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
