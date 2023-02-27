package section04_JavaCore.topic23_Logger.practice.logger;

import section04_JavaCore.topic23_Logger.practice.logger.exception.AuthenticationException;
import section04_JavaCore.topic23_Logger.practice.logger.model.User;
import section04_JavaCore.topic23_Logger.practice.logger.service.AuthenticationService;
import section04_JavaCore.topic23_Logger.practice.logger.service.AuthenticationServiceImpl;
import section04_JavaCore.topic23_Logger.practice.logger.service.OrderService;
import section04_JavaCore.topic23_Logger.practice.logger.service.OrderServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    public static void main(String[] args) {
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        User user;
        try {
            user = authenticationService.login("bob", "1234");
        } catch (AuthenticationException e) {
            logger.error("Can't login. Params: login=bob");
            return;
        }
        OrderService orderService = new OrderServiceImpl();
        orderService.completeOrder(user.getUserId());
    }
}
