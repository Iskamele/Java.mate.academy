package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.mapper;

import org.springframework.stereotype.Component;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Role;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.RoleResponseDto;

@Component
public class RoleMapper {
    public RoleResponseDto mapToDto(Role role) {
        RoleResponseDto responseDto = new RoleResponseDto();
        responseDto.setId(role.getId());
        responseDto.setName(role.getRoleName().name());
        return responseDto;
    }
}
