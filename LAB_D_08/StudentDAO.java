package lab8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    public void addStudent(Student student) {
        // The SQL query with question marks as safe placeholders
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
        
        // Use try-with-resources to automatically close connections
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            // Swap the question marks with actual data from the Student object
            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getStudentName());
            statement.setInt(3, student.getMark());
            
            // Execute the insert command
            statement.executeUpdate();
            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

// Method for Question 3: Display all students
    public void displayAllStudents() {
        // SQL query to select all data
        String sql = "SELECT student_id, student_name, mark FROM students";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             // executeQuery() is used for SELECT statements, returning a ResultSet
             ResultSet resultSet = statement.executeQuery()) {
            
            System.out.println("--- Student List ---"); 
            
            // Loop through the ResultSet row by row
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("student_id") + 
                                   " | Name: " + resultSet.getString("student_name") + 
                                   " | Mark: " + resultSet.getInt("mark"));
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }