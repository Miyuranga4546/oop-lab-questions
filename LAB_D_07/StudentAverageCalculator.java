package LAB_D_07;

public class StudentAverageCalculator {
    
    // Private attributes
    private int totalMarks;
    private int numberOfStudents;

    // Constructor to initialize both values
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // Method to calculate and return the average
    public int calculateAverage() {
        return totalMarks / numberOfStudents; 
    }
}