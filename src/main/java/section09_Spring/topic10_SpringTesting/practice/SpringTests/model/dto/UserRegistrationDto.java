package section09_Spring.topic10_SpringTesting.practice.SpringTests.model.dto;

import section09_Spring.topic10_SpringTesting.practice.SpringTests.validation.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.validation.Password;

@Password(field = "password", fieldMatch = "repeatPassword")
public class UserRegistrationDto {
    @Email
    private String email;
    @NotEmpty(message = "The password couldn't be empty")
    @Size(min = 8, message = "Password must be at least 8 symbols long")
    private String password;
    private String repeatPassword;

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
