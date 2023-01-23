package section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.service;

import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.model.User;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.exceptions.RegistrationException;

public interface RegistrationService {
    User register(User user) throws RegistrationException;
}
