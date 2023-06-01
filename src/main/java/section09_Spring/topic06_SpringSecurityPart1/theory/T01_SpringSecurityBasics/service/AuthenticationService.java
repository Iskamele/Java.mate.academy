package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.service;

import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.exception.AuthenticationException;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.model.User;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;
}
