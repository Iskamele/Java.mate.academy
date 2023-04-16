package section07_JavaWeb.topic04_SecurityInWeb.theory.T07_AuthFilterDebugAndImprovement.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T07_AuthFilterDebugAndImprovement.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T07_AuthFilterDebugAndImprovement.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
