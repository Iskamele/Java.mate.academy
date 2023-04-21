package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.dao;

import java.util.Optional;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
