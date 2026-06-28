package LAB_D_07;

public class StudentMarkReport {
    
    // Private attribute for the array
    private String[] marks;

    // Constructor to initialize the array
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Method to get and convert the mark
    public int getMarkAt(int index) {
        return Integer.parseInt(marks[index]);
    }
}