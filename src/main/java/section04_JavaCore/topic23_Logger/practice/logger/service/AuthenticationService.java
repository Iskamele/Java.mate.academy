package section04_JavaCore.topic23_Logger.practice.logger.service;

import mate.academy.exception.AuthenticationException;
import mate.academy.model.User;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;
}
