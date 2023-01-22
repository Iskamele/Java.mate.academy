package section04_JavaCore.topic18_JavaJUnit.theory.T04_JUnitBestPractices.exceptions;

public class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}
