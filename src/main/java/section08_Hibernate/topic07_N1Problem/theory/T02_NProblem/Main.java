package section08_Hibernate.topic07_N1Problem.theory.T02_NProblem;

import java.util.ArrayList;
import java.util.List;
import section08_Hibernate.topic07_N1Problem.theory.T02_NProblem.dao.AuthorDao;
import section08_Hibernate.topic07_N1Problem.theory.T02_NProblem.dao.AuthorDaoImpl;
import section08_Hibernate.topic07_N1Problem.theory.T02_NProblem.model.Author;
import section08_Hibernate.topic07_N1Problem.theory.T02_NProblem.model.Book;

public class Main {

    public static void main(String[] args) {
        AuthorDao authorDao = new AuthorDaoImpl(HibernateUtil.getSessionFactory());

        Author agatha = getAuthorData(
                "Agatha Christie", "Three Blind Mice");
        Author lesya = getAuthorData(
                "Lesya Ukrainka", "Lisova mavka");
        Author victor = getAuthorData(
                "Victor Hugo", "The Man Who Laughs");

        authorDao.save(agatha);
        authorDao.save(lesya);
        authorDao.save(victor);

        List<Author> authors = authorDao.getAll();
        for (Author author : authors) {
            int size = author.getBooks().size(); // N+1 problem here
            System.out.println(author.getName() + " has " + size + " books");
        }
    }

    private static Author getAuthorData(String authorName, String bookTitle) {
        Author author = new Author();
        author.setName(authorName);

        List<Book> books = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            Book book = new Book(bookTitle + " " + i);
            books.add(book);
        }
        author.setBooks(books);
        return author;
    }
}
