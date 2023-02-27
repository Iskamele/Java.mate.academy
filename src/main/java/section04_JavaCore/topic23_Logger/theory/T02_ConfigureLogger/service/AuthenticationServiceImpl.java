package section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.model.User;
import section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.exception.AuthenticationException;

public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    @Override
    public User login(String login, String password) throws AuthenticationException {
        logger.info("login method was called");
        User user = findByLogin(login);
        if (!user.getPassword().equals(password)) {
            throw new AuthenticationException("Username or password are incorrect");
        }
        return user;
    }

    private User findByLogin(String login) {
        return new User(login, "1234"); // this user should be fetch from DB
    }
}
