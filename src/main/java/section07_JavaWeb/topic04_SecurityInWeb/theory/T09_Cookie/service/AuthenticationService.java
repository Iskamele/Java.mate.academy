package section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
