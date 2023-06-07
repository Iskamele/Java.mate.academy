package section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.model.Role;

public interface RoleDao {
    Role save(Role role);

    Optional<Role> get(Long id);

    List<Role> findAll();

    void delete(Long id);
}
