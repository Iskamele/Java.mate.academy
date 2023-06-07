package section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.security;

import java.util.Set;
import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.model.User;
import section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.service.RoleService;
import section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.service.UserService;

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
}
