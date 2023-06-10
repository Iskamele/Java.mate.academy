package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.controller;

import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dto.UserLoginDto;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dto.UserRegistrationDto;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.exception.AuthenticationException;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.jwt.JwtTokenProvider;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.User;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.security.AuthenticationService;

public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final JwtTokenProvider jwtTokenProvider;

    public AuthenticationController(AuthenticationService authenticationService, JwtTokenProvider jwtTokenProvider) {
        this.authenticationService = authenticationService;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping("/register")
    public void register(@RequestBody @Valid UserRegistrationDto userRequestDto) {
        authenticationService.register(userRequestDto.getEmail(), userRequestDto.getPassword());
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Valid UserLoginDto userLoginDto) throws AuthenticationException {
        User user = authenticationService.login(userLoginDto.getLogin(),
                userLoginDto.getPassword());
        String token = jwtTokenProvider.createToken(user.getEmail(), user.getRoles().stream()
                        .map(role -> role.getRoleName().name())
                .collect(Collectors.toList()));
        return new ResponseEntity<>(Map.of("token", token), HttpStatus.OK);
    }
}
