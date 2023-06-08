package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.security;

import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.exception.AuthenticationException;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;

public interface AuthenticationService {
    User register(String email, String password);

    User login(String login, String password) throws AuthenticationException;
}
