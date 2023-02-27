package section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.service;

import section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.model.User;
import section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.exception.AuthenticationException;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;
}
