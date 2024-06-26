package section09_Spring.topic10_SpringTesting.practice.SpringTests.security.jwt;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.Role;

public class JwtTokenProviderTest {
    private static final String SECRET_KEY = "secret";
    private static final long MILLISECONDS = 3600000L;
    private static final String EMAIL = "bob@i.ua";
    private static final String PASSWORD = "qwerty";
    private final List<String> roleList = new ArrayList<>();
    private JwtTokenProvider jwtTokenProvider;
    private UserDetailsService userDetailsService;

    @BeforeEach
    void setUp() throws NoSuchFieldException, IllegalAccessException {
        userDetailsService = Mockito.mock(UserDetailsService.class);
        jwtTokenProvider = new JwtTokenProvider(userDetailsService);

        Field fieldSK = JwtTokenProvider.class.getDeclaredField("secretKey");
        fieldSK.setAccessible(true);
        fieldSK.set(jwtTokenProvider, SECRET_KEY);
        Field fieldViM = JwtTokenProvider.class.getDeclaredField("validityInMilliseconds");
        fieldViM.setAccessible(true);
        fieldViM.setLong(jwtTokenProvider, MILLISECONDS);

        roleList.add(Role.RoleName.USER.name());
        roleList.add(Role.RoleName.ADMIN.name());
    }

    @Test
    void createToken_Ok() {
        // Act
        String token = jwtTokenProvider.createToken(EMAIL, roleList);

        //assert
        Assertions.assertNotNull(token);
        Assertions.assertTrue(token.length() > 128);
    }

    @Test
    public void getAuthentication_Ok() {
        //arrange
        UserDetails userDetails = new User(EMAIL, PASSWORD, Collections.emptySet());
        Mockito.when(userDetailsService.loadUserByUsername(Mockito.any())).thenReturn(userDetails);

        //act
        String token = jwtTokenProvider.createToken(EMAIL, roleList);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                (UsernamePasswordAuthenticationToken) jwtTokenProvider.getAuthentication(token);

        //assert
        Assertions.assertEquals(EMAIL,
                ((User) usernamePasswordAuthenticationToken.getPrincipal()).getUsername());
        Assertions.assertEquals(PASSWORD,
                ((User) usernamePasswordAuthenticationToken.getPrincipal()).getPassword());
    }

    @Test
    public void getAuthentication_nullToken_notOk() {
        //act & assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> jwtTokenProvider.getAuthentication(null));
    }

    @Test
    public void resolveToken_Ok() {
        //arrange
        HttpServletRequest mock = Mockito.mock(HttpServletRequest.class);
        Mockito.when(mock.getHeader(Mockito.any())).thenReturn("Bearer " + EMAIL);

        //act & assert
        Assertions.assertEquals(EMAIL, jwtTokenProvider.resolveToken(mock));
    }

    @Test
    void getUsername_ok() {
        //arrange
        String token = jwtTokenProvider.createToken(EMAIL, roleList);

        //act & assert
        Assertions.assertEquals(EMAIL, jwtTokenProvider.getUsername(token));
    }

    @Test
    void getUsername_nullToken_ok() {
        //act & assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> jwtTokenProvider.getUsername(null));
    }

    @Test
    public void resolveToken_wrongToken_notOk() {
        //arrange
        HttpServletRequest mock = Mockito.mock(HttpServletRequest.class);
        Mockito.when(mock.getHeader(Mockito.any())).thenReturn(EMAIL);

        //act & assert
        Assertions.assertNotEquals(EMAIL, jwtTokenProvider.resolveToken(mock));
    }

    @Test
    public void validateToken_notOK() {
        //act & assert
        Assertions.assertThrows(RuntimeException.class,
                () -> jwtTokenProvider.validateToken("0000.0000.0000"));
    }
}
