package section07_JavaWeb.topic04_SecurityInWeb.theory.T06_AuthFilterImplementation.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T06_AuthFilterImplementation.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T06_AuthFilterImplementation.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
