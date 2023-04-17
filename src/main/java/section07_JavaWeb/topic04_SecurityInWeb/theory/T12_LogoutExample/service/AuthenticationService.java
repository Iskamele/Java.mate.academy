package section07_JavaWeb.topic04_SecurityInWeb.theory.T12_LogoutExample.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T12_LogoutExample.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T12_LogoutExample.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
