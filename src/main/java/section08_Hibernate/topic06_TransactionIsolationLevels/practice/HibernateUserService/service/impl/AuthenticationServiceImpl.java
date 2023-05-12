package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.impl;

import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.exception.AuthenticationException;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.exception.RegistrationException;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Inject;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Service;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.User;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.AuthenticationService;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.UserService;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.util.HashUtil;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final int MIN_PASSWORD_LENGTH = 1;
    @Inject
    private UserService userService;

    @Override
    public User login(String email, String password) throws AuthenticationException {
        passwordValidation(password);
        Optional<User> optionalUser = userService.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            String hashPassword = HashUtil.hashPassword(password, user.getSalt());
            if (hashPassword.equals(user.getPassword())) {
                return user;
            }
        }
        throw new AuthenticationException("Can't authenticate user: invalid email or password");
    }

    @Override
    public User register(String email, String password) throws RegistrationException {
        passwordValidation(password);
        if (userService.findByEmail(email).isPresent()) {
            throw new RegistrationException("User with email: " + email + " is already exists");
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return userService.add(user);
    }

    private void passwordValidation(String password) {
        if (password.length() < MIN_PASSWORD_LENGTH) {
            throw new RuntimeException(
                    "Password length must be equal to or greater than " + MIN_PASSWORD_LENGTH);
        }
    }
}
