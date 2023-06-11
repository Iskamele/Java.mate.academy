package section09_Spring.topic10_SpringTesting.practice.SpringTests.service.impl;

import section09_Spring.topic10_SpringTesting.practice.SpringTests.dao.RoleDao;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.Role;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.service.RoleService;
import org.springframework.stereotype.Service;

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
}
