package section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
