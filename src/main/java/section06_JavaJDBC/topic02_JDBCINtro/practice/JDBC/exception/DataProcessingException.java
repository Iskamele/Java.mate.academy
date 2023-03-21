package section06_JavaJDBC.topic02_JDBCINtro.practice.JDBC.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
