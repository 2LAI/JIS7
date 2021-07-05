package homework.lectures.jdbc.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {

    public static final String USERNAME = "postgres";
    public static final String PASS = "admin";
    public static final String URL = "jdbc:postgresql://localhost:8085/JIS7";

    static Connection connection;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        return connection = DriverManager.getConnection(URL, USERNAME, PASS);
    }

    public static Statement getStatement() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(URL, USERNAME, PASS);
        return connection.createStatement();
    }
}
