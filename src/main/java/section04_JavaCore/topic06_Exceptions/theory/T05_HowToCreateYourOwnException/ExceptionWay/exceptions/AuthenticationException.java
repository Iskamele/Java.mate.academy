package section04_JavaCore.topic06_Exceptions.theory.T05_HowToCreateYourOwnException.ExceptionWay.exceptions;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
