package section09_Spring.topic10_SpringTesting.practice.SpringTests.service;

import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.Role;

public interface RoleService {
    Role save(Role role);

    Role getRoleByName(String roleName);
}
