package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao;

import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.model.MessageDetails;

public interface MessageDetailsDao {
    MessageDetails create(MessageDetails entity);

    MessageDetails get(Long id);
}
