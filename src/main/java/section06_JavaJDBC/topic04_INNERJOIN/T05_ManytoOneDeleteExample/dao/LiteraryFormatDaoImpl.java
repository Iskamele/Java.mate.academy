package section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.exception.DataProcessingException;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.lib.Dao;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.model.LiteraryFormat;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.util.ConnectionUtil;

@Dao
public class LiteraryFormatDaoImpl implements LiteraryFormatDao {
    @Override
    public LiteraryFormat create(LiteraryFormat format) {
        String query = "INSERT INTO literary_formats(format) values(?);";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, format.getFormat());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                Long id = resultSet.getObject(1, Long.class);
                format.setId(id);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Can't insert format to DB ", e);
        }
        return format;
    }

    @Override
    public Optional<LiteraryFormat> get(Long id) {
        String query = "SELECT * FROM literary_formats WHERE id = ? AND is_deleted = FALSE;";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                LiteraryFormat literaryFormat = parseFormat(resultSet);
                return Optional.of(literaryFormat);
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            throw new DataProcessingException(
                    "Can't get format by id: " + id + ", from DB", e);
        }
    }

    @Override
    public List<LiteraryFormat> getAll() {
        String query = "SELECT * FROM literary_formats WHERE is_deleted = false";
        List<LiteraryFormat> formatList = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                LiteraryFormat literaryFormat = parseFormat(resultSet);
                formatList.add(literaryFormat);
            }
        } catch (SQLException e) {
            throw new DataProcessingException("Can't get all formats from DB ", e);
        }
        return formatList;
    }

    @Override
    public LiteraryFormat update(LiteraryFormat literaryFormat) {
        String query = "UPDATE literary_formats SET format = ? WHERE id = ? AND is_deleted = FALSE;";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(query)) {
            preparedStatement.setString(1, literaryFormat.getFormat());
            preparedStatement.setLong(2, literaryFormat.getId());
            int updatedRows = preparedStatement.executeUpdate();
            if (updatedRows > 0) {
                return literaryFormat;
            }
        } catch (SQLException e) {
            throw new DataProcessingException(
                    "Can't update format: " + literaryFormat + " in DB", e);
        }
        throw new NoSuchElementException(
                "Can't find format: " + literaryFormat + " in DB");
    }

    @Override
    public boolean delete(Long id) {
        String query = "UPDATE literary_formats SET is_deleted = true WHERE id = ?";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setLong(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Can't insert format to DB ", e);
        }
    }

    private LiteraryFormat parseFormat(ResultSet resultSet) throws SQLException {
        String format = resultSet.getString("format");
        Long id = resultSet.getObject("id", Long.class);
        LiteraryFormat literaryFormat = new LiteraryFormat();
        literaryFormat.setId(id);
        literaryFormat.setFormat(format);
        return literaryFormat;
    }
}
