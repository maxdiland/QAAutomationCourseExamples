package lesson10;

import org.hsqldb.jdbc.JDBCDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * author Maksim Diland
 */
public class Example2 {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new JDBCDriver());
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:C:/Users/Max/Desktop/portabledb/?user=SA");
        boolean successful = insertUser(connection, new User(5, "Alina", "alina@gmail.com", "alinaalina"));
        System.out.println( successful );
        connection.close();
    }

    public static boolean insertUser(Connection connection, User user) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
//            int updatedRows = statement.executeUpdate(
//                    "INSERT INTO USER (DISPLAYNICKNAME, EMAIL, PASSWORD) VALUES (" + user.getDisplayNickName() + ", " + user.getEmail() + ", " + user.getPassword() + ")"
//            );

            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO USER (DISPLAYNICKNAME, EMAIL, PASSWORD) VALUES (?, ?, ?);");

            preparedStatement.setString(1, user.getDisplayNickName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());

            int updatedRows = preparedStatement.executeUpdate();


            return updatedRows > 0;


        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class User {
    private int id;
    private String displayNickName;
    private String email;
    private String password;

    public User(int id, String displayNickName, String email, String password) {
        this.id = id;
        this.displayNickName = displayNickName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayNickName() {
        return displayNickName;
    }

    public void setDisplayNickName(String displayNickName) {
        this.displayNickName = displayNickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
