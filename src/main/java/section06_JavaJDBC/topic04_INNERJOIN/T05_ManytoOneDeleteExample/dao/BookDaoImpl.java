package section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.exception.DataProcessingException;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.model.Book;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.model.LiteraryFormat;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.util.ConnectionUtil;

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
        return book;
    }

    @Override
    public Optional<Book> get(Long id) {
        String query = "SELECT b.id AS book_id, title, price, lf.format, lf.id AS literary_format_id " +
                "FROM books b " +
                "JOIN literary_formats lf " +
                "ON b.literary_format_id = lf.id " +
                "WHERE b.id = ?;";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
//                Book book = getBook(resultSet);
                String title = resultSet.getNString("title");
                BigDecimal price = resultSet.getBigDecimal("price");
                LiteraryFormat literaryFormat = new LiteraryFormat();
                literaryFormat.setId(resultSet.getObject("literary_format_id", Long.class));
                literaryFormat.setFormat(resultSet.getString("format"));
                Book book = new Book();
                book.setId(id);
                book.setTitle(title);
                book.setPrice(price);
                book.setFormat(literaryFormat);
                return Optional.of(book);
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Can't insert format to DB", e);
        }
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

//    private Book getBook(ResultSet resultSet) throws SQLException {
//        Long id = resultSet.getObject(1, Long.class);
//        String title = resultSet.getNString("title");
//        BigDecimal price = resultSet.getBigDecimal("price");
//        LiteraryFormat literaryFormat = new LiteraryFormat();
//        literaryFormat.setId(resultSet.getObject("literary_format_id", Long.class));
//        literaryFormat.setFormat(resultSet.getString("format"));
//        Book book = new Book();
//        book.setId(id);
//        book.setTitle(title);
//        book.setPrice(price);
//        book.setFormat(literaryFormat);
//        return book;
//    }
}
