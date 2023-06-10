package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.controller;

import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.dto.UserLoginDto;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.dto.UserRegistrationDto;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.exception.AuthenticationException;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.jwt.JwtTokenProvider;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.User;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.security.AuthenticationService;

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
