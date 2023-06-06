package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service;

import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.exception.AuthenticationException;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String email, String password);
}
