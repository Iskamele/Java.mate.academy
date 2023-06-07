package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service;

import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
