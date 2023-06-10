package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.controller;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.Role;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.User;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.security.AuthenticationService;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.service.RoleService;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.service.UserService;

@RestController
@RequestMapping("/inject")
public class InjectController {
    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping
    public String injectData() {
        roleService.save(new Role(Role.RoleName.ADMIN));
        roleService.save(new Role(Role.RoleName.USER));
        authenticationService.register("bob@i.ua", "1234");
        // feel free to save some users for testing
        // hint: you can save users with different roles
        User alice = new User();
        alice.setPassword("1234");
        alice.setEmail("alice@i.ua");
        alice.setRoles(Set.of(roleService.getRoleByName("ADMIN")));
        userService.save(alice);
        return "Done!";
    }
}
