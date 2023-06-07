package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service;

import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}