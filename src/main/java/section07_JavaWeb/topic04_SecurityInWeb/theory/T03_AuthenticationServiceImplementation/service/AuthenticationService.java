package section07_JavaWeb.topic04_SecurityInWeb.theory.T03_AuthenticationServiceImplementation.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T03_AuthenticationServiceImplementation.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T03_AuthenticationServiceImplementation.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
