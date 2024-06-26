package Hibernate.topic03_JPAAndCascadeTypes.HibernateCascade.dao.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import Hibernate.topic03_JPAAndCascadeTypes.HibernateCascade.dao.AbstractTest;
import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.MessageDetailsDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.impl.MessageDetailsDaoImpl;
import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.model.MessageDetails;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageDetailsDaoImplTest extends AbstractTest {
    private static final LocalDateTime DEFAULT_TIME
            = LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 25));
    private MessageDetailsDao messageDetailsDao;

    @Before
    public void setUp() {
        messageDetailsDao = new MessageDetailsDaoImpl(getSessionFactory());
    }

    @Override
    protected Class<?>[] entities() {
        return new Class[]{MessageDetails.class};
    }

    @Test
    public void createMessageDetails_Ok() {
        MessageDetails messageDetails = new MessageDetails();
        messageDetails.setSender("Bob");
        messageDetails.setSentTime(DEFAULT_TIME);
        MessageDetails actual = messageDetailsDao.create(messageDetails);
        Assert.assertNotNull("Check you have implemented the `create` method " +
                "in the MessageDetailsDaoImpl class", actual);
        Assert.assertNotNull(actual.getId());
        Assert.assertEquals(1L, actual.getId().longValue());
        Assert.assertNotNull(actual.getSender());
        Assert.assertEquals("Bob", actual.getSender());
        Assert.assertNotNull(actual.getSentTime());
        Assert.assertEquals(DEFAULT_TIME, actual.getSentTime());
    }

    @Test
    public void getById_Ok() {
        MessageDetails messageDetails = new MessageDetails();
        messageDetails.setSender("Bob");
        messageDetails.setSentTime(DEFAULT_TIME);
        MessageDetails created = messageDetailsDao.create(messageDetails);
        Assert.assertNotNull(created.getId());
        Assert.assertEquals(1L, created.getId().longValue());

        // Validate get(Long id) works as expected
        MessageDetails actual = messageDetailsDao.get(1L);
        Assert.assertNotNull("Check you have implemented the `create` method " +
                "in the MessageDetailsDaoImpl class", actual);
        Assert.assertNotNull(actual.getId());
        Assert.assertEquals(1L, actual.getId().longValue());
        Assert.assertNotNull(actual.getSender());
        Assert.assertEquals("Bob", actual.getSender());
        Assert.assertNotNull(actual.getSentTime());
        Assert.assertEquals(DEFAULT_TIME, actual.getSentTime());
    }
}
