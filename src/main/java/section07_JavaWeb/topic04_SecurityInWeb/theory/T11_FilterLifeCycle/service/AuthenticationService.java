package section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
