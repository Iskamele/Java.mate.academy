package section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.service;

import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.dao.StorageDao;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.dao.StorageDaoImpl;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.exceptions.RegistrationException;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.model.User;

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
