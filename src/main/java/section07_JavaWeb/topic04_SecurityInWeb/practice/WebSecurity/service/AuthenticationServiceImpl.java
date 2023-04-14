package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.service;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.lib.Inject;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.lib.Service;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private PasswordUtil passwordUtil;
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> optionalDriver = driverService.findByLogin(login);
        if (optionalDriver.isEmpty()
                || !passwordUtil.checkPassword(optionalDriver.get().getPassword(), password)) {
            throw new AuthenticationException("Login or password was incorrect");
        }
        return optionalDriver.get();
    }
}
