package section04_JavaCore.topic23_Logger.theory.T04_LogLevels;

import section04_JavaCore.topic23_Logger.theory.T04_LogLevels.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.theory.T04_LogLevels.model.User;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;
}
