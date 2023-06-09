package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.dao.impl;

import java.util.List;
import java.util.Optional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.dao.RoleDao;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.Role;

@Repository
public class RoleDaoImpl implements RoleDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public Optional<Role> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
