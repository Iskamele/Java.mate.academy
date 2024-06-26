package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {
    T create(T element);

    Optional<T> get(Long id);

    List<T> getAll();

    T update(T element);

    boolean delete(Long id);
}
