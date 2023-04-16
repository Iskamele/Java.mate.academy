package section07_JavaWeb.topic04_SecurityInWeb.theory.T04_DisplayCustomErrorMessage.exception;

public class AuthenticationException extends Exception {

    public AuthenticationException(String message) {
        super(message);
    }
}
