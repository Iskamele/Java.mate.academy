package section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.service;

import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.model.Role;

public interface RoleService {
    void save(Role role);

    Role getRoleByName(String name);
}
