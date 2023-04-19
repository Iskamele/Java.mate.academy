package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.dao;

import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.model.Movie;

public interface MovieDao {
    Movie save(Movie movie);

    Movie get(Long id);
}