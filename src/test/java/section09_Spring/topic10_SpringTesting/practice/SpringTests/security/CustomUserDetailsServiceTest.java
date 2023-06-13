package section09_Spring.topic10_SpringTesting.practice.SpringTests.security;

import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.Role;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.User;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.service.UserService;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.service.impl.UserServiceImpl;

class CustomUserDetailsServiceTest {
    private static final String EMAIL = "bob@i.ua";
    private static final String PASSWORD = "qwerty";
    private static final String NOT_EXISTING_EMAIL = "alice@i.ua";
    private UserService userService;
    private UserDetailsService userDetailsService;
    private User user;

    @BeforeEach
    void setUp() {
        userService = Mockito.mock(UserServiceImpl.class);
        userDetailsService = new CustomUserDetailsService(userService);
        user = new User();
        user.setEmail(EMAIL);
        user.setPassword(PASSWORD);
        user.setRoles(Set.of(new Role(Role.RoleName.USER)));
    }

    @Test
    void loadUserByUsername_Ok() {
        //arrange
        Mockito.when(userService.findByEmail(EMAIL)).thenReturn(Optional.of(user));

        //act
        UserDetails actual = userDetailsService.loadUserByUsername(EMAIL);

        //assert
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(EMAIL, actual.getUsername());
        Assertions.assertEquals(PASSWORD, actual.getPassword());
    }

    @Test
    void loadUserByUsername_usernameNotFound_NotOk() {
        //arrange
        Mockito.when(userService.findByEmail(NOT_EXISTING_EMAIL)).thenReturn(Optional.empty());

        //act & assert
        UsernameNotFoundException exception =
                Assertions.assertThrows(UsernameNotFoundException.class,
                        () -> userDetailsService.loadUserByUsername(NOT_EXISTING_EMAIL));
        Assertions.assertEquals("User not found.", exception.getMessage());
        Mockito.verify(userService).findByEmail(NOT_EXISTING_EMAIL);
    }
}
