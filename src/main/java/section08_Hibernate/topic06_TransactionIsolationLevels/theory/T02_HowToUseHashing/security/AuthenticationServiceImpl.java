package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.security;

import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.util.HashUtil;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.exception.AuthenticationException;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.model.User;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.service.UserService;

public class AuthenticationServiceImpl implements AuthenticationService {
    private UserService userService;

    @Override
    public void register(String login, String password) {
        userService.save(new User(login, password));
    }

    @Override
    public User login(String login, String password) {
        Optional<User> userFromDbOptional = userService.findByLogin(login);
        if (userFromDbOptional.isEmpty()) {
            throw new AuthenticationException("Can't authentication user.");
        }
        User user = userFromDbOptional.get();
        String hashedPassword = HashUtil.hashPassword(password, user.getSalt());
        if (user.getPassword().equals(hashedPassword)) {
            return user;
        }
        throw new AuthenticationException("Can't authentication user.");
    }
}
