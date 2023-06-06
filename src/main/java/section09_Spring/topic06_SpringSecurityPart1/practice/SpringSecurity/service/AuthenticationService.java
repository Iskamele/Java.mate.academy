package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service;

import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
