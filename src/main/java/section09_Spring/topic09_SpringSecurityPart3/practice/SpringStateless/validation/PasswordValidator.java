package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.UserRegistrationDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRegistrationDto> {
    private String field;
    private String fieldMatch;

    public void initialize(Password constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(UserRegistrationDto registrationDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        Object fieldValue = new BeanWrapperImpl(registrationDto)
                .getPropertyValue(field);
        Object fieldMatchValue = new BeanWrapperImpl(registrationDto)
                .getPropertyValue(fieldMatch);

        return fieldValue != null && fieldValue.equals(fieldMatchValue);
    }
}
