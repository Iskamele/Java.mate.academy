package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.model.User;

public interface UserDao {
    User save(User movie);

    User get(Long id);
}
