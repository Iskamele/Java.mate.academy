package section06_JavaJDBC.topic02_JDBCINtro.theory.T09_StatementPreparedStatementAndCallableStatement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't load JDBC driver for MySQL ", e);
        }
    }

    public static Connection getConnection() {
        try {
            Properties dbProperties = new Properties();
            dbProperties.put("user", "root");
            dbProperties.put("password", "8CMT3f~8F4H_2v+f4py^d7+3p%MP)!fG");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db", dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
