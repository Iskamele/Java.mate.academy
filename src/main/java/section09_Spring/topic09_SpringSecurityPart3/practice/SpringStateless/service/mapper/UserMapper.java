package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.mapper;

import java.util.HashSet;
import java.util.List;
import org.springframework.stereotype.Component;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.RoleResponseDto;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.UserRegistrationDto;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.UserResponseDto;

@Component
public class UserMapper {
    private final RoleMapper roleMapper;

    public UserMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    public User mapToModel(UserRegistrationDto requestDto) {
        User user = new User();
        user.setPassword(requestDto.getPassword());
        user.setEmail(requestDto.getEmail());
        user.setRoles(new HashSet<>());
        return user;
    }

    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setEmail(user.getEmail());
        List<RoleResponseDto> roles = user.getRoles()
                .stream()
                .map(roleMapper::mapToDto)
                .toList();
        responseDto.setRoles(roles);
        return responseDto;
    }
}
