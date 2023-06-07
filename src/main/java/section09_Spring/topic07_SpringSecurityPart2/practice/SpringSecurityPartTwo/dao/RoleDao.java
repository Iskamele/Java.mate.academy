package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao;

import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(Role.RoleName roleName);
}
