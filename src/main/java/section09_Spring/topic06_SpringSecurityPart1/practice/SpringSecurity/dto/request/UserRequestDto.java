package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.request;

import java.util.Objects;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.validation.Email;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.validation.Password;

@Password
public class UserRequestDto {
    @Email
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRequestDto that = (UserRequestDto) o;
        return Objects.equals(email, that.email)
                && Objects.equals(password, that.password)
                && Objects.equals(repeatPassword, that.repeatPassword);
    }
}
