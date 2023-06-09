package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.User;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }
}
