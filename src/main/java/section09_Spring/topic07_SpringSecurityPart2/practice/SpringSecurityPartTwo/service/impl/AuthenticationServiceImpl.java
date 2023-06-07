package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.impl;

import java.util.Set;
import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Role;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.AuthenticationService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.RoleService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.ShoppingCartService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final static String ROLE_USER_NAME = Role.RoleName.USER.name();
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(Set.of(roleService.getByName(ROLE_USER_NAME)));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
