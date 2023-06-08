package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto;

import java.util.List;

public class UserResponseDto {
    private String email;
    private String password;
    private List<RoleResponseDto> roles;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleResponseDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleResponseDto> roles) {
        this.roles = roles;
    }
}
