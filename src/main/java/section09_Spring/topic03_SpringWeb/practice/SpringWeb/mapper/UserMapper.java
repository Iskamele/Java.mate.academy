package section09_Spring.topic03_SpringWeb.practice.SpringWeb.mapper;

import section09_Spring.topic03_SpringWeb.practice.SpringWeb.dto.UserResponseDto;
import section09_Spring.topic03_SpringWeb.practice.SpringWeb.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponseDto parse(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName());
    }
}
