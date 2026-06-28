package lab8;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    
    public static void main(String[] args) {
        
        // Try to establish the connection
        try (Connection connection = StudentDatabaseConnection.getConnection()) {
            
            // If the code reaches here, the connection was successful
            System.out.println("Database connected successfully.");
            
        } catch (SQLException e) {
            
            // If something goes wrong, print a simple database error message
            System.out.println("Database connection failed: " + e.getMessage());
            
        }
    }
}