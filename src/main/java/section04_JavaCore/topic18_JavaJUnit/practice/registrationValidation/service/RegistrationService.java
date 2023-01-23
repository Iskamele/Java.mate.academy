package section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.service;

import core.basesyntax.exceptions.RegistrationException;
import core.basesyntax.model.User;

public interface RegistrationService {
    User register(User user) throws RegistrationException;
}
