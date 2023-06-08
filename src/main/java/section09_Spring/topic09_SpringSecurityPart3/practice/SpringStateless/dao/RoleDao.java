package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Role;

public interface RoleDao {
    Role save(Role role);

    Optional<Role> getRoleByName(String roleName);

    List<Role> findAll();
}
