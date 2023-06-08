package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.security;

import java.util.Optional;
import java.util.Set;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.exception.AuthenticationException;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.RoleService;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationServiceImpl(UserService userService,
                                     RoleService roleService,
                                     PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.roleService = roleService;
        this.passwordEncoder = passwordEncoder;
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
    public User login(String login, String password) throws AuthenticationException {
        Optional<User> user = userService.findByEmail(login);
        if (user.isEmpty() || !passwordEncoder.matches(password, user.get().getPassword())) {
            throw new AuthenticationException("Incorrect username or password!!!");
        }
        return user.get();
    }
}
