package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
