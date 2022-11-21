package section04_JavaCore.topic06_Exceptions.practice.UserScore;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
