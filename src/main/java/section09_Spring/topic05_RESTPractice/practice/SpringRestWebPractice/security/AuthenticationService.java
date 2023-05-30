package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.security;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.exception.AuthenticationException;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String email, String password);
}
