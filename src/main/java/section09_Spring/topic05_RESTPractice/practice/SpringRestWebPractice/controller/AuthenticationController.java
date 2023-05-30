package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.controller;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.dto.request.UserRequestDto;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.security.AuthenticationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public void register(@RequestBody UserRequestDto requestDto) {
        authenticationService.register(requestDto.getEmail(), requestDto.getPassword());
    }
}
