package section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging;


import section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.service.AuthenticationService;
import section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.service.AuthenticationServiceImpl;

public class Main {

    public static void main(String[] args) throws AuthenticationException {
        // Logging
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        authenticationService.login("bill", "1234");
    }
}
