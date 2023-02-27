package section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger;


import section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.service.AuthenticationService;
import section04_JavaCore.topic23_Logger.theory.T02_ConfigureLogger.service.AuthenticationServiceImpl;

public class Main {

    public static void main(String[] args) throws AuthenticationException {
        // Logging
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        authenticationService.login("bill", "1234");
    }
}
