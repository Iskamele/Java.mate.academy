package section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import section04_JavaCore.topic23_Logger.theory.T03_LoggingBestPractices.exception.AuthenticationException;

public class Main {
    // Логгировать перед ошибками - плохо
    // Логгировать параметры (не важные) - ок
    // Использовать правильные log levels

    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    public static void main(String[] args) {
        // Logging
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        try {
            authenticationService.login("bill", "12344");
        } catch (AuthenticationException e) {
            logger.error("Can't login", e);
        }
    }
}
