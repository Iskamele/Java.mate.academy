package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Coach;
import java.util.List;

public interface CoachDao extends PersonDao {
    List<Coach> findByExperienceGreaterThan(int years);
}
