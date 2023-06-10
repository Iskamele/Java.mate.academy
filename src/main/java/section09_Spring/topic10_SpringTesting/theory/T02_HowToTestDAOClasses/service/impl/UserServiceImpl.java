package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.User;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.service.UserService;

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
