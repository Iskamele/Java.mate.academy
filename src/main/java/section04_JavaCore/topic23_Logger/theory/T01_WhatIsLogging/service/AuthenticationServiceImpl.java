package section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.service;

import section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.model.User;

public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public User login(String login, String password) throws AuthenticationException {
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
