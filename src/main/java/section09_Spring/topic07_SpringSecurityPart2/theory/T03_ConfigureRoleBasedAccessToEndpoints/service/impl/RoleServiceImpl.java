package section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.service.impl;

import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.model.Role;
import section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public void save(Role role) {

    }

    @Override
    public Role getRoleByName(String name) {
        return null;
    }
}
