package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Movie;


public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
