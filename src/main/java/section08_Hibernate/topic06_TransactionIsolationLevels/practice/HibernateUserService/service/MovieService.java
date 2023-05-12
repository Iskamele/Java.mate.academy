package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service;

import java.util.List;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
