package section07_JavaWeb.topic04_SecurityInWeb.theory.T08_HttpSessionOverview.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T08_HttpSessionOverview.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T08_HttpSessionOverview.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
