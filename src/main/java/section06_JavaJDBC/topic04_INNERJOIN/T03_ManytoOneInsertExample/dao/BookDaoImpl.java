package section06_JavaJDBC.topic04_INNERJOIN.T03_ManytoOneInsertExample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import section06_JavaJDBC.topic04_INNERJOIN.T03_ManytoOneInsertExample.model.Book;
import section06_JavaJDBC.topic04_INNERJOIN.T03_ManytoOneInsertExample.util.ConnectionUtil;

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
}
