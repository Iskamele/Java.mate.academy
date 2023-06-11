package section09_Spring.topic10_SpringTesting.practice.SpringTests.dao;

import java.util.Optional;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.Role;

public interface RoleDao {
    Role save(Role role);

    Optional<Role> getRoleByName(String roleName);
}
