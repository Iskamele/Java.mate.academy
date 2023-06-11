package section09_Spring.topic10_SpringTesting.practice.SpringTests.security;

import section09_Spring.topic10_SpringTesting.practice.SpringTests.exception.AuthenticationException;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.User;

public interface AuthenticationService {
    User register(String email, String password);

    User login(String login, String password) throws AuthenticationException;
}
