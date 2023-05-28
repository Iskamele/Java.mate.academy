package section09_Spring.topic04_REST.practice.SpringRest.security;

import section09_Spring.topic04_REST.practice.SpringRest.exception.AuthenticationException;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String email, String password);
}
