import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the MySQL database
            String url = "jdbc:mysql://localhost:3306/student";
            String user = "foo";
            String password = "bar";
            Connection connection = DriverManager.getConnection(url, user, password);

            // Print a message if the connection is successful
            System.out.println("Connected to the database.");

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: MySQL JDBC driver not found.");
            e.printStackTrace();    
        } catch (SQLException e) {
            System.err.println("Error: Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
