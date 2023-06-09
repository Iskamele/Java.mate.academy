package section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.security;

import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
