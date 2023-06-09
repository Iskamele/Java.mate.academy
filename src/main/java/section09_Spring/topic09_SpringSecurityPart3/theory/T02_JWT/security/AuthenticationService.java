package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.security;

import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.User;

public interface AuthenticationService {
    User register(String email, String password);

    User login(String login, String password);
}
