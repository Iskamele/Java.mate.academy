package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T03_Proxy.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T03_Proxy.model.User;

public interface UserDao {
    User save(User entity);

    User get(Long id);
}
