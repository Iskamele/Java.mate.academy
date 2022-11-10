package section04_JavaCore.topic06_Exceptions.theory.T05_HowToCreateYourOwnException.RuntimeExceptionWay.exceptions;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message) {
        super(message);
    }
}
