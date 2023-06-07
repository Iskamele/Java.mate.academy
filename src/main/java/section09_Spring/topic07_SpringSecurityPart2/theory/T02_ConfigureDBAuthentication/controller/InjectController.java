package section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.security.AuthenticationService;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.service.RoleService;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.model.Role;

@RestController
@RequestMapping("/inject")
public class InjectController {
    @Autowired
    private RoleService roleService;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping
    public String injectData() {
        roleService.save(new Role(Role.RoleName.ADMIN));
        roleService.save(new Role(Role.RoleName.USER));
        authenticationService.register("bob@i.ua", "1234");
        // feel free to save some users for testing
        // hint: you can save users with different roles
        return "Done!";
    }
}
