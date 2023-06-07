package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.AbstractDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.RoleDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.exception.DataProcessingException;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Role;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName roleName) {
        try (Session session = factory.openSession()) {
            return session.createQuery("FROM Role WHERE roleName = :roleName", Role.class)
                    .setParameter("roleName", roleName)
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get role by name: " + roleName, e);
        }
    }
}
