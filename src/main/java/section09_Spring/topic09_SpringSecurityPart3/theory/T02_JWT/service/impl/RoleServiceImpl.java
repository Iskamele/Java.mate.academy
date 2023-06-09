package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.service.impl;

import org.springframework.stereotype.Service;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.Role;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.service.RoleService;

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
