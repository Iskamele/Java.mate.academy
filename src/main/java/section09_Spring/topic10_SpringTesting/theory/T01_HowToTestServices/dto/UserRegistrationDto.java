package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.dto;

//TODO VALIDATION
public class UserRegistrationDto {
    private String email;
    private String password;
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
