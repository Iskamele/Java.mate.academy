package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final int MIN_PASSWORD_LENGTH = 64;

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getPassword() == null
                || !Objects.equals(userRequestDto.getPassword(),
                userRequestDto.getRepeatPassword())) {
            return false;
        }
        return userRequestDto != null
                && userRequestDto.getPassword() != null
                && userRequestDto.getPassword().length() >= MIN_PASSWORD_LENGTH
                && userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}