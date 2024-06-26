package section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool.models.LiteraryFormat;
import section06_JavaJDBC.topic02_JDBCINtro.theory.T05_ConnectionClosingConnectionPool.util.ConnectionUtil;

public class LiteraryFormatDaoImpl implements LiteraryFormatDao {
    @Override
    public List<LiteraryFormat> getAll() {
        List<LiteraryFormat> allFormats = new ArrayList<>();

        try (Connection connection = ConnectionUtil.getConnection();
             Statement getAllFormatsStatement = connection.createStatement();) {
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
}
