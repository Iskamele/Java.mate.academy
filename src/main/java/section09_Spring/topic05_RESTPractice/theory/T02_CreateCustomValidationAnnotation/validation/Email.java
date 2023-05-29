package section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.validation.EmailValidator;

@Constraint(validatedBy = EmailValidator.class) // какой класс будет выполнять проверку
@Target({ElementType.PARAMETER, ElementType.FIELD}) // над чем можно использовать аннотацию
@Retention(RetentionPolicy.RUNTIME) // аннотация будет доступна во время выполнения кода
public @interface Email {
    String message() default "Invalid email";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
