package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.request;

import javax.validation.constraints.Size;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.lib.FieldsValueMatch;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.lib.ValidEmail;

@FieldsValueMatch(
        field = "password",
        fieldMatch = "repeatPassword",
        message = "Passwords do not match!"
)
public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 8, max = 40)
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
