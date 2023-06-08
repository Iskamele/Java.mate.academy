package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.controller;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Product;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Role;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.ProductService;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.RoleService;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.UserService;

@RestController
@RequestMapping("/inject")
public class InjectController {
    private final RoleService roleService;
    private final ProductService productService;
    private final UserService userService;

    public InjectController(RoleService roleService,
                            ProductService productService, UserService userService) {
        this.roleService = roleService;
        this.productService = productService;
        this.userService = userService;
    }

    @GetMapping
    public String injectData() {
        List<Role> roles = roleService.findAll();
        if (!roles.isEmpty()) {
            return "Injection was completed";
        }
        // Save roles
        roleService.save(new Role(Role.RoleName.ADMIN));
        roleService.save(new Role(Role.RoleName.USER));
        roles = roleService.findAll();

        // save users
        User bob = new User();
        bob.setEmail("bob");
        bob.setPassword("1234");
        bob.setRoles(new HashSet<>(roles));
        userService.save(bob);

        User alice = new User();
        alice.setEmail("alice");
        alice.setPassword("1234");
        alice.setRoles(Set.of(roles.get(0)));
        userService.save(alice);

        // save products
        Product iphone = new Product();
        iphone.setName("iPhone 7");
        iphone.setPrice(BigDecimal.valueOf(499));

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(695));

        Product samsung10 = new Product();
        samsung10.setName("Samsung S10");
        samsung10.setPrice(BigDecimal.valueOf(600));

        productService.save(iphone);
        productService.save(samsung);
        productService.save(samsung10);
        return "Done!";
    }
}
