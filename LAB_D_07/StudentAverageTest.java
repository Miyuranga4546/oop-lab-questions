package LAB_D_07;

public class StudentAverageTest {
    
    public static void main(String[] args) {
        // Create the calculator object using 0 as the number of students
        StudentAverageCalculator calc = new StudentAverageCalculator(500, 0);

        try {
            // Call calculateAverage() inside a try block
            int avg = calc.calculateAverage();
            System.out.println("Average: " + avg);
            
        } catch (ArithmeticException e) {
            // An ArithmeticException occurs here because integer division by zero is mathematically undefined.
            
            // Print a simple error message
            System.out.println("Error: Number of students cannot be zero.");
            
        } finally {
            // finally block to print completion message
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
}