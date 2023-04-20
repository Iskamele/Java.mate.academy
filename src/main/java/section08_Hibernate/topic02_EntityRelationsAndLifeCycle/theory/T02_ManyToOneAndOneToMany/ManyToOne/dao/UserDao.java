package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.model.User;

public interface UserDao {
    User save(User movie);

    User get(Long id);
}
