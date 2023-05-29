package section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.service.mapper;

import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.User;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.dto.UserRegistrationDto;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.dto.UserResponseDto;

public class UserDtoMapper {
    public UserResponseDto toDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setName(user.getName());
        responseDto.setEmail(user.getEmail());
        responseDto.setPassword(user.getPassword());
        return responseDto;
    }

    public User toModel(UserRegistrationDto userRegistrationDto) {
        User user = new User();
        user.setName(userRegistrationDto.getName());
        user.setEmail(userRegistrationDto.getEmail());
        user.setPassword(userRegistrationDto.getPassword());
        return user;
    }
}
