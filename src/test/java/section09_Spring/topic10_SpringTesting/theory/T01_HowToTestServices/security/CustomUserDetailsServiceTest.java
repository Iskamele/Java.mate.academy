package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.security;

import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.Role;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.User;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.service.UserService;

class CustomUserDetailsServiceTest {
    private UserDetailsService userDetailsService;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = Mockito.mock(UserService.class);
        userDetailsService = new CustomUserDetailsService(userService);
    }

    @Test
    void loadUserByUsername_Ok() {
        String email = "bob@i.ua";
        User bob = new User();
        bob.setEmail(email);
        bob.setPassword("1234");
        bob.setRoles(Set.of(new Role(Role.RoleName.USER)));

        //Mockito.when(userService.findByEmail(any())).thenReturn(Optional.of(bob)); для любого входа
        Mockito.when(userService.findByEmail(email)).thenReturn(Optional.of(bob));

        UserDetails actual = userDetailsService.loadUserByUsername(email);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(email, actual.getUsername());
        Assertions.assertEquals("1234", actual.getPassword());
    }

    @Test
    void loadUserByUsername_UsernameNotFound() {
        String email = "bob@i.ua";
        User bob = new User();
        bob.setEmail(email);
        bob.setPassword("1234");
        bob.setRoles(Set.of(new Role(Role.RoleName.USER)));

        Mockito.when(userService.findByEmail(email)).thenReturn(Optional.of(bob));
        try {
            userDetailsService.loadUserByUsername("alice@i.ua");
        } catch (UsernameNotFoundException e) {
            Assertions.assertEquals("User not found", e.getMessage());
            return;
        }
        Assertions.fail("Expected to received UsernameNotFoundException");
    }
}