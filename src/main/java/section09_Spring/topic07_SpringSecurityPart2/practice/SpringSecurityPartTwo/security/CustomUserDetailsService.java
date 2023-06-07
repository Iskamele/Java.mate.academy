package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.security;

import org.springframework.security.core.userdetails.User.UserBuilder;
import static org.springframework.security.core.userdetails.User.withUsername;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Role;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.UserService;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        User user = userService.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException("User with email " + email + " not found"));
        UserBuilder builder = withUsername(email);
        builder.password(user.getPassword());
        builder.roles(user.getRoles().stream()
                .map(Role::getRoleName)
                .toArray(String[]::new));
        return builder.build();
    }
}