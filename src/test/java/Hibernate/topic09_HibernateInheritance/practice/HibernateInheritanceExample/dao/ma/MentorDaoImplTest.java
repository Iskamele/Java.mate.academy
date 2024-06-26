package Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma;

import Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.AbstractTest;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma.MentorDao;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma.MentorDaoImpl;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Coach;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Mentor;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Person;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MentorDaoImplTest extends AbstractTest {
    private MentorDao mentorDao;

    @Override
    protected Class<?>[] entities() {
        return new Class[] {
                Person.class,
                Coach.class,
                Mentor.class
        };
    }

    @Before
    public void setUp() {
        mentorDao = new MentorDaoImpl(getSessionFactory());
    }

    @Test
    public void findByAge_Ok() {
        Mentor firstMentor = new Mentor();
        firstMentor.setName("FirstMentor");
        firstMentor.setAge(23);
        Mentor secondMentor = new Mentor();
        secondMentor.setName("SecondMentor");
        secondMentor.setAge(25);
        Mentor thirdMentor = new Mentor();
        thirdMentor.setName("FirstMentor");
        thirdMentor.setAge(18);
        mentorDao.save(firstMentor);
        mentorDao.save(secondMentor);
        mentorDao.save(thirdMentor);

        Assert.assertNotNull(firstMentor.getId());
        Assert.assertNotNull(secondMentor.getId());
        Assert.assertNotNull(thirdMentor.getId());

        List<Mentor> byAgeGreaterThan = mentorDao.findByAgeGreaterThan(20);
        Assert.assertEquals(2, byAgeGreaterThan.size());
    }
}
