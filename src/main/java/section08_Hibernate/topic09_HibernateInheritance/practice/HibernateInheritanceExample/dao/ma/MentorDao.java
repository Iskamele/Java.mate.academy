package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Mentor;
import java.util.List;

public interface MentorDao extends PersonDao {
    List<Mentor> findByAgeGreaterThan(int age);
}
