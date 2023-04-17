package section07_JavaWeb.topic04_SecurityInWeb.theory.T10_SessionVsCookie.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T10_SessionVsCookie.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T10_SessionVsCookie.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
