package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.service.impl;

import org.springframework.stereotype.Service;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.Role;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.service.RoleService;

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
