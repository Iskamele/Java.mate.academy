package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.service;

import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.Role;

public interface RoleService {
    void save(Role role);

    Role getRoleByName(String name);
}
