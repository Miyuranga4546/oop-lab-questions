package lab8; // Make sure this matches your actual NetBeans package name

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnection {
    
    // Constants for database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/oop_lab_08";
    private static final String USERNAME = "root";
    
    // REPLACE THIS with your actual MySQL Workbench password!
    private static final String PASSWORD = "electronic@4546";

    // Static method to get and return the database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}