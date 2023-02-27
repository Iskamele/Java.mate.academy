package section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices;

import section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices.model.User;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;
}
