package section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices.model.User;

public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    @Override
    public User login(String login, String password) throws AuthenticationException {
        logger.info("login method was called. Params: login = {}", login); // логгировать пароль - плохо
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
