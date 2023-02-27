package section04_JavaCore.topic23_Logger.practice.logger.service;


import section04_JavaCore.topic23_Logger.practice.logger.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.practice.logger.model.User;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;
}
