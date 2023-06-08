package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service;

import java.util.List;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Role;

public interface RoleService {
    Role save(Role role);

    Role getRoleByName(String roleName);

    List<Role> findAll();
}
