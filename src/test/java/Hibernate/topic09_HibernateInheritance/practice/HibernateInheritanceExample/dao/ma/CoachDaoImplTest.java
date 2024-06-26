package Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma;

import Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.AbstractTest;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma.CoachDao;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma.CoachDaoImpl;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Coach;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Mentor;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Person;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoachDaoImplTest extends AbstractTest {
    private CoachDao coachDao;

    @Override
    protected Class<?>[] entities() {
        return new Class[]{
                Person.class,
                Coach.class,
                Mentor.class
        };
    }

    @Before
    public void setUp() {
        coachDao = new CoachDaoImpl(getSessionFactory());
    }

    @Test
    public void findByExperience_Ok() {
        Coach coach = new Coach();
        coach.setName("Coach");
        coach.setAge(30);
        coach.setExperience(3);
        Coach secondCoach = new Coach();
        secondCoach.setName("SecondCoach");
        secondCoach.setAge(28);
        secondCoach.setExperience(2);
        coachDao.save(coach);
        coachDao.save(secondCoach);

        Assert.assertNotNull(coach.getId());
        Assert.assertNotNull(secondCoach.getId());

        List<Coach> coaches = coachDao.findByExperienceGreaterThan(2);
        Assert.assertEquals(1, coaches.size());
        Assert.assertEquals("Coach", coaches.get(0).getName());
    }

    @Test
    public void findByNonExistentExperience() {
        Assert.assertEquals(0, coachDao.findByExperienceGreaterThan(3).size());
    }
}
