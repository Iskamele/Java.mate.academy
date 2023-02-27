package section04_JavaCore.topic23_Logger.practice.logger.exception;

public class AuthenticationException extends Exception {

    public AuthenticationException(String message) {
        super(message);
    }
}
