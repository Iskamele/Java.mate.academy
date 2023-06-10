package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.security;

import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.User;

public interface AuthenticationService {
    User register(String email, String password);

    User login(String login, String password);
}
