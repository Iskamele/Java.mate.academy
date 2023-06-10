package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.Role;

public interface RoleDao {
    Role save(Role role);

    Optional<Role> get(Long id);

    List<Role> findAll();

    void delete(Long id);
}
