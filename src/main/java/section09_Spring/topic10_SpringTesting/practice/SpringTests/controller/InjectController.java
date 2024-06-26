package section09_Spring.topic10_SpringTesting.practice.SpringTests.controller;

import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.Role;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.security.AuthenticationService;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.service.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inject")
public class InjectController {
    private final RoleService roleService;

    private final AuthenticationService authenticationService;

    public InjectController(RoleService roleService,
                            AuthenticationService authenticationService) {
        this.roleService = roleService;
        this.authenticationService = authenticationService;
    }

    @GetMapping
    public String injectData() {
        roleService.save(new Role(Role.RoleName.ADMIN));
        roleService.save(new Role(Role.RoleName.USER));

        authenticationService.register("bob", "1234");
        // feel free to save some users for testing
        // hint: you can save users with different roles
        return "Done!";
    }
}
