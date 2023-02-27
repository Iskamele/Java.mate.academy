package section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.service;

import section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.model.User;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;
}
