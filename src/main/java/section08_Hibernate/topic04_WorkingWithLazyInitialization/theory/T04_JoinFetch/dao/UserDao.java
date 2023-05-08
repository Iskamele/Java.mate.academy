package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.model.User;

public interface UserDao {
    User save(User entity);

    User get(Long id);
}
