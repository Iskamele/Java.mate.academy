package section07_JavaWeb.topic03_WebPractice.practice.WebPractice.service;

import java.util.List;

public interface GenericService<T> {
    T create(T element);

    T get(Long id);

    List<T> getAll();

    T update(T element);

    boolean delete(Long id);
}
