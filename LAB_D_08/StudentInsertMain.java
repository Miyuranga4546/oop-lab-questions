package lab8;

public class StudentInsertMain {
    
    public static void main(String[] args) {
        
        // 1. Create one Student object
        Student newStudent = new Student(1, "Nimal Perera", 82);
        
        // 2. Create one StudentDAO object
        StudentDAO studentDAO = new StudentDAO();
        
        // 3. Call the method to save the student to the database
        studentDAO.addStudent(newStudent);
        
    }
}