package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
