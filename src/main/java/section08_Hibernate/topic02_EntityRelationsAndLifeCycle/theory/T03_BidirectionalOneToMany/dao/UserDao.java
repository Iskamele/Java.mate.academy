package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.model.User;

public interface UserDao {
    User save(User movie);

    User get(Long id);
}
