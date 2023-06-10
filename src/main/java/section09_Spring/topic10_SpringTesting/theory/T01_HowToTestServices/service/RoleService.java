package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.service;

import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.Role;

public interface RoleService {
    void save(Role role);

    Role getRoleByName(String name);
}
