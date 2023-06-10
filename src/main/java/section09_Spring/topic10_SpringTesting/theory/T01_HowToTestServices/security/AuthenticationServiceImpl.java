package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.security;

import java.util.Set;
import org.springframework.stereotype.Service;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.User;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.service.RoleService;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(Set.of(roleService.getRoleByName("USER")));
        user = userService.save(user);
        return user;
    }

    @Override
    public User login(String login, String password) {
        return null;
    }
}
