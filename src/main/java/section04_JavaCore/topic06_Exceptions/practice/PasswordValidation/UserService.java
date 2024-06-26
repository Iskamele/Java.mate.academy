package section04_JavaCore.topic06_Exceptions.practice.PasswordValidation;

public class UserService {
    private final PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (Exception e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
