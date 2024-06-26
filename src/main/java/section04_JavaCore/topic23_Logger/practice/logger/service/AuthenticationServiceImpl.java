package section04_JavaCore.topic23_Logger.practice.logger.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import section04_JavaCore.topic23_Logger.practice.logger.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.practice.logger.model.User;

public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    @Override
    public User login(String login, String password) throws AuthenticationException {
        logger.debug("Method login was called. Params: login={}", login);
        User user = findByLogin(login);
        if (!user.getPassword().equals(password)) {
            throw new AuthenticationException("Username or password are incorrect");
        }
        return user;
    }

    private User findByLogin(String login) {
        User user = new User(login, "1234");
        // this user identifier should be set by DB. We will use dummy data for this example
        user.setUserId(2L);
        return user;
    }
}
