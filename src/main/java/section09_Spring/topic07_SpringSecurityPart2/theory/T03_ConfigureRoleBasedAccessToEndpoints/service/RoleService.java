package section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.service;

import section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.model.Role;

public interface RoleService {
    void save(Role role);

    Role getRoleByName(String name);
}
