package section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.dao;

import section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.model.User;

public interface UserDao {
    User save(User user);

    User get(Long id);
}
