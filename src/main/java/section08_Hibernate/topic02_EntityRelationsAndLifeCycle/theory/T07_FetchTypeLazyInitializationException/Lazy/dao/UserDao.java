package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.model.User;

public interface UserDao {
    User save(User movie);

    User get(Long id);
}
