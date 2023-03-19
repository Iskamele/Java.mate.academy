package section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample.models.LiteraryFormat;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T08_INSERTExample.util.ConnectionUtil;

public class LiteraryFormatDaoImpl implements LiteraryFormatDao {
    @Override
    public List<LiteraryFormat> getAll() {
        List<LiteraryFormat> allFormats = new ArrayList<>();

        try (Connection connection = ConnectionUtil.getConnection();
             Statement getAllFormatsStatement = connection.createStatement()) {
            ResultSet resultSet = getAllFormatsStatement
                    .executeQuery("SELECT * FROM literary_formats");
            while (resultSet.next()) {
                String format = resultSet.getString("format");
                Long id = resultSet.getObject("id", Long.class);
                LiteraryFormat literaryFormat = new LiteraryFormat();
                literaryFormat.setId(id);
                literaryFormat.setFormat(format);
                allFormats.add(literaryFormat);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Can't get all formats from DB ", e);
        }
        return allFormats;
    }

    @Override
    public LiteraryFormat create(LiteraryFormat format) {
        String insertFormatRequest = "INSERT INTO literary_formats(format) values(?);";
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement createFormatsStatement =
                     connection.prepareStatement(insertFormatRequest, Statement.RETURN_GENERATED_KEYS)) {
            createFormatsStatement.setString(1, format.getFormat());
            createFormatsStatement.executeUpdate();
            ResultSet generatedKeys = createFormatsStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                Long id = generatedKeys.getObject(1, Long.class);
                format.setId(id);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Can't insert format to DB ", e);
        }
        return format;
    }
}
