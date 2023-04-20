package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.model.User;

public interface UserDao {
    User save(User movie);

    User get(Long id);
}
