package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.service;

import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
