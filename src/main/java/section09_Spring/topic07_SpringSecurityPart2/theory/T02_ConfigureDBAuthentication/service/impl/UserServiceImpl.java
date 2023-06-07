package section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.model.User;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
