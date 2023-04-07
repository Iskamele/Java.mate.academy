package section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.dao.BookDao;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.lib.Inject;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.lib.Service;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.model.Book;
import section06_JavaJDBC.topic04_INNERJOIN.T11_DeleteAndUpdateEntityWithManytoMany.service.BookService;

@Service
public class BookServiceImpl implements BookService {
    @Inject
    private BookDao bookDao;

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book create(Book book) {
        return bookDao.create(book);
    }

    @Override
    public Book get(Long id) {
        return bookDao.get(id).orElseThrow(
                () -> new NoSuchElementException("Book with id " + id + " not found"));
    }

    @Override
    public Book update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public boolean delete(Long id) {
        return bookDao.delete(id);
    }
}
