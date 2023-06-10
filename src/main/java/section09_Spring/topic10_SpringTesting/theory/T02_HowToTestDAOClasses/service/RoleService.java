package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.service;

import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.Role;

public interface RoleService {
    void save(Role role);

    Role getRoleByName(String name);
}
