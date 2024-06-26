package section07_JavaWeb.topic06_HowToAddProjectToGitHub.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static final String URL =
            "jdbc:mysql://awseb-e-zpmx8pqmpn-stack-awsebrdsdatabase-puvmhd8stlul.caytpkzyd4v8"
                    + ".eu-north-1.rds.amazonaws.com/taxi";
    private static final String USERNAME = "iskamele";
    private static final String PASSWORD = "+UxE-G%dfB9oDy#5.%yhA%r";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
