package section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.dto.UserRegistrationDto;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.dto.UserResponseDto;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.service.UserService;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.User;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.service.mapper.UserDtoMapper;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final UserDtoMapper userDtoMapper;
    private final UserService userService;

    public AuthenticationController(UserDtoMapper userDtoMapper, UserService userService) {
        this.userDtoMapper = userDtoMapper;
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserResponseDto responseDto(@RequestBody @Valid UserRegistrationDto registrationDto) {
        User user = userService.save(userDtoMapper.toModel(registrationDto));
        return userDtoMapper.toDto(user);
    }
}
