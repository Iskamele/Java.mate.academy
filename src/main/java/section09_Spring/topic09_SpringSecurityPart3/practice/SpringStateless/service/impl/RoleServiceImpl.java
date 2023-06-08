package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao.RoleDao;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Role;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role save(Role role) {
        return roleDao.save(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDao.getRoleByName(roleName).orElseThrow();
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
