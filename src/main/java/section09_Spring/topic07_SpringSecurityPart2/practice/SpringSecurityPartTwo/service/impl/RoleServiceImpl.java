package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.impl;

import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.RoleDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Role;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(Role.RoleName.valueOf(roleName)).orElseThrow(
                () -> new RuntimeException("Role with name " + roleName + " not found"));
    }
}
