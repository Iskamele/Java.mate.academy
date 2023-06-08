package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.UserRegistrationDto;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.UserResponseDto;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.security.AuthenticationService;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.mapper.UserMapper;

@RestController
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final UserMapper userMapper;

    public AuthenticationController(AuthenticationService authenticationService,
                                    UserMapper userMapper) {
        this.authenticationService = authenticationService;
        this.userMapper = userMapper;
    }

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody @Valid UserRegistrationDto userRequestDto) {
        User user = authenticationService.register(userRequestDto.getEmail(),
                userRequestDto.getPassword());
        return userMapper.mapToDto(user);
    }
}
