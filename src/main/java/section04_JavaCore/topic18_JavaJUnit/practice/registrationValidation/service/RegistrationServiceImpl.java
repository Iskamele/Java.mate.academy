package section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.service;

import core.basesyntax.dao.StorageDao;
import core.basesyntax.dao.StorageDaoImpl;
import core.basesyntax.exceptions.RegistrationException;
import core.basesyntax.model.User;

public class RegistrationServiceImpl implements RegistrationService {
    private final StorageDao storageDao = new StorageDaoImpl();
    private final static int MIN_AGE = 18;
    private final static int MIN_PASSWORD_LENGTH = 6;

    @Override
    public User register(User user) throws RegistrationException {
        if (user == null) {
            throw new RegistrationException("User can't be null.");
        }
        if (user.getLogin() == null) {
            throw new RegistrationException("Login can't be null.");
        }
        if (storageDao.get(user.getLogin()) != null) {
            if (storageDao.get(user.getLogin()).getLogin().equals(user.getLogin())) {
                throw new RegistrationException("Login " + user.getLogin() + " are exist.");
            }
        }
        if (user.getAge() == null || user.getAge() < MIN_AGE) {
            throw new RegistrationException("Age must be 18+.");
        }
        if (user.getPassword() == null || user.getPassword().length() < MIN_PASSWORD_LENGTH) {
            throw new RegistrationException("Minimum password length must be 6 characters.");
        }
        return storageDao.add(user);
    }
}
