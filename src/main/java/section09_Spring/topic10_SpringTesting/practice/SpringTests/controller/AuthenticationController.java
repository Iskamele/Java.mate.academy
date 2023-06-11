package section09_Spring.topic10_SpringTesting.practice.SpringTests.controller;

import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.exception.AuthenticationException;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.User;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.dto.UserLoginDto;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.dto.UserRegistrationDto;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.security.AuthenticationService;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.security.jwt.JwtTokenProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final JwtTokenProvider jwtTokenProvider;

    public AuthenticationController(AuthenticationService authenticationService,
                                    JwtTokenProvider jwtTokenProvider) {
        this.authenticationService = authenticationService;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping("/register")
    public void register(@RequestBody @Valid UserRegistrationDto userRequestDto) {
        authenticationService.register(userRequestDto.getEmail(), userRequestDto.getPassword());
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Valid UserLoginDto userLoginDto)
            throws AuthenticationException {
        User user = authenticationService.login(userLoginDto.getLogin(),
                userLoginDto.getPassword());
        List<String> roles = user.getRoles().stream()
                .map(role -> role.getRoleName().name())
                .toList();
        String token = jwtTokenProvider.createToken(user.getEmail(), roles);
        return new ResponseEntity<>(Map.of("token", token), HttpStatus.OK);
    }
}
