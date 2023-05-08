package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.model.User;

public interface UserDao {
    User save(User entity);

    User get(Long id);
}
