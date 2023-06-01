package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics;

import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.dao.UserDaoImpl;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.exception.AuthenticationException;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.service.AuthenticationServiceImpl;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.service.AuthenticationService;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.model.User;

public class Main {

    public static void main(String[] args) throws AuthenticationException {
        UserDaoImpl userDao = new UserDaoImpl();
        AuthenticationService authenticationService = new AuthenticationServiceImpl(userDao);
        User bob = authenticationService.login("bob", "1234");

        // 1. login + password
        // 2. facebook button
    }
}
