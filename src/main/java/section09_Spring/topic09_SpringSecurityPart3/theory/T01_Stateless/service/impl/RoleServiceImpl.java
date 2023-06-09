package section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.service.impl;

import org.springframework.stereotype.Service;
import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.model.Role;
import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.service.RoleService;

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
