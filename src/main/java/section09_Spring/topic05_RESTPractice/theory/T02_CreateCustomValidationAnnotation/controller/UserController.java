package section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.dto.UserResponseDto;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.service.UserService;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.service.mapper.UserDtoMapper;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserDtoMapper userDtoMapper;

    public UserController(UserService userService, UserDtoMapper userDtoMapper) {
        this.userService = userService;
        this.userDtoMapper = userDtoMapper;
    }

    @GetMapping("/")
    public List<UserResponseDto> getAllUsers() {
        return userService.findAll()
                .stream()
                .map(userDtoMapper::toDto)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/{id}")
    public UserResponseDto get(@PathVariable Long id) {
        return userDtoMapper.toDto(userService.get(id));
    }
}
