import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionTest {
    public static void main(String[] args) {
        // Database URL (localhost, port 3306, your DB name)
        String url = "jdbc:mysql://localhost:3306/?user=root";
        
        String user = "root";
        String password = "pass";

        try {
            // Attempt to establish a connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");
            conn.close(); // Always close the connection
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
