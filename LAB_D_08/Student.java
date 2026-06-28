package lab8;

public class Student {
    
    // Private attributes
    private int studentId;
    private String studentName;
    private int mark;

    // Constructor to initialize the values
    public Student(int studentId, String studentName, int mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }

    // Getter methods for all attributes
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMark() {
        return mark;
    }
}