package section07_JavaWeb.topic06_HowToAddProjectToGitHub.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
