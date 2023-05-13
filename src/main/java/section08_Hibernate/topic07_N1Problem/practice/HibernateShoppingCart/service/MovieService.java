package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service;

import java.util.List;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
