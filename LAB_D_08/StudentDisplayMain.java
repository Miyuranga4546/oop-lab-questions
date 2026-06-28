package lab8;

public class StudentDisplayMain {
    
    public static void main(String[] args) {
        
        // Create the DAO object
        StudentDAO studentDAO = new StudentDAO();
        
        // Call the method to print all students
        studentDAO.displayAllStudents();
        
    }
}