package lesson10;

import org.hsqldb.jdbc.JDBCDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * author Maksim Diland
 */
public class Example1 {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new JDBCDriver());
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:C:/Users/Max/Desktop/portabledb/?user=SA");
        Statement statement = connection.createStatement();
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("SELECT * FROM PUBLIC.USER");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while (resultSet.next()) {
            System.out.println( resultSet.getString(2) );
        }

        connection.close();
    }
}
