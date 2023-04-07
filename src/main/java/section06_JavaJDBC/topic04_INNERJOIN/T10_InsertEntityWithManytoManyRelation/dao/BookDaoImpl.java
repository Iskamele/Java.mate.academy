package section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.exception.DataProcessingException;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.model.Author;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.model.Book;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.model.LiteraryFormat;
import section06_JavaJDBC.topic04_INNERJOIN.T10_InsertEntityWithManytoManyRelation.util.ConnectionUtil;

public class BookDaoImpl implements BookDao {
    @Override
    public Book create(Book book) {
        String query = "INSERT INTO books (title, price, literary_format_id)" +
                " VALUES (?, ?, ?);";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)
        ) {
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setBigDecimal(2, book.getPrice());
            preparedStatement.setLong(3, book.getFormat().getId());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                Long id = resultSet.getObject(1, Long.class);
                book.setId(id);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Can't insert format to DB", e);
        }
        insertAuthors(book);
        return book;
    }

    private void insertAuthors(Book book) {
        String query = "INSERT INTO books_authors (book_id, author_id) VALUES (?, ?);";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, book.getId());
            for (Author author : book.getAuthors()) {
                preparedStatement.setLong(2, author.getId());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Can't insert authors to book: " + book, e);
        }
    }

    @Override
    public Book get(Long id) {
        String query = "SELECT b.id AS book_id, title, price, lf.format, lf.id AS literary_format_id " +
                "FROM books b " +
                "JOIN literary_formats lf " +
                "ON b.literary_format_id = lf.id " +
                "WHERE b.id = ?;";
        Book book = null;
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                book = parseBookWithLiteraryFormatFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Can't find book in DB by id " + id, e);
        }
        if (book != null) {
            book.setAuthors(getAuthorsForBook(id));
        }
        //return Optional.ofNullable(book);
        return book;
    }

    @Override
    public boolean delete(String title) {
        String query = "UPDATE books SET is_deleted = TRUE WHERE title = ?;";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement prepareStatement =
                     connection.prepareStatement(query)) {
            prepareStatement.setString(1, title);
            return prepareStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DataProcessingException("Can't delete book by title: " + title, e);
        }
    }

    private Book parseBookWithLiteraryFormatFromResultSet(ResultSet resultSet) throws SQLException {
        Book book = new Book();
        book.setTitle(resultSet.getNString("title"));
        book.setPrice(resultSet.getBigDecimal("price"));
        LiteraryFormat literaryFormat = new LiteraryFormat();
        literaryFormat.setId(resultSet.getObject("literary_format_id", Long.class));
        literaryFormat.setFormat(resultSet.getString("format"));
        book.setFormat(literaryFormat);
        book.setId(resultSet.getObject("book_id", Long.class));
        return book;
    }

    private List<Author> getAuthorsForBook(Long bookId) {
        String getAuthorsForBookRequest = "SELECT id, first_name, last_name "
                + "FROM authors a "
                + "JOIN books_authors ba "
                + "ON a.id = ba.author_id "
                + "WHERE ba.book_id = ?;";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(getAuthorsForBookRequest)) {
            preparedStatement.setLong(1, bookId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Author> authors = new ArrayList<>();
            while (resultSet.next()) {
                authors.add(parseAuthorsFromResultSet(resultSet));
            }
            return authors;
        } catch (SQLException e) {
            throw new RuntimeException("Can't find authors in DB by book id " + bookId, e);
        }
    }

    private Author parseAuthorsFromResultSet(ResultSet resultSet) throws SQLException {
        Author author = new Author();
        author.setId(resultSet.getObject("id", Long.class));
        author.setFirstName(resultSet.getString("first_name"));
        author.setLastName(resultSet.getString("last_name"));
        return author;
    }
}
