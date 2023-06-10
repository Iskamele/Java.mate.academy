package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dao.RoleDao;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.Role;

@Repository
public class RoleDaoImpl extends AbstractDao<Role, Long> implements RoleDao {

    public RoleDaoImpl(SessionFactory sessionFactory, Class<Role> clazz) {
        super(sessionFactory, clazz);
    }
}
