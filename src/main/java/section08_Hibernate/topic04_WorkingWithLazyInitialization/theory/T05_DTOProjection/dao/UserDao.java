package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.User;

public interface UserDao {
    User save(User entity);

    User get(Long id);
}
