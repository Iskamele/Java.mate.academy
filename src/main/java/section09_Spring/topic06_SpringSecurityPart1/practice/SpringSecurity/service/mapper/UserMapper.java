package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper;

import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.response.UserResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        return responseDto;
    }
}
