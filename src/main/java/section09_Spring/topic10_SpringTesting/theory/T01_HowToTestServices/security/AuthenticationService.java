package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.security;

import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.User;

public interface AuthenticationService {
    User register(String email, String password);

    User login(String login, String password);
}
