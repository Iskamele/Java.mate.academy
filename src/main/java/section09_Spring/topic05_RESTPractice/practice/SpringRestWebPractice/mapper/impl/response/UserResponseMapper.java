package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.impl.response;

import org.springframework.stereotype.Component;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.DtoResponseMapper;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.dto.response.UserResponseDto;

@Component
public class UserResponseMapper implements DtoResponseMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto toDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }
}
