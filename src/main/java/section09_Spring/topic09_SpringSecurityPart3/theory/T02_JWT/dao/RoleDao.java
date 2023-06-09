package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.Role;

public interface RoleDao {
    Role save(Role role);

    Optional<Role> get(Long id);

    List<Role> findAll();

    void delete(Long id);
}
