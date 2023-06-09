package section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.model.User;
import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.service.UserService;

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
