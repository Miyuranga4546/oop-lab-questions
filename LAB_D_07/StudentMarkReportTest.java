package LAB_D_07;

public class StudentMarkReportTest {
    
    public static void main(String[] args) {
        // Create the string array and the report object
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);

        // --- PART B: Test an Invalid Array Index ---
        try {
            // Attempt to access index 6
            int mark1 = report.getMarkAt(6);
            System.out.println("Mark: " + mark1);
            
        } catch (ArrayIndexOutOfBoundsException e) { 
            // Part D Comment: getMarkAt(6) causes an exception because the array only has 4 items (indexes 0 to 3). Index 6 is out of bounds.
            
            // Print simple error message
            System.out.println("Error: Selected mark position does not exist.");
            
        } finally {
            // Print completion message
            System.out.println("Array access checking completed.");
        }

        // --- PART C: Test an Invalid Number Format ---
        try {
            // Attempt to access index 2, which holds the text "absent"
            int mark2 = report.getMarkAt(2);
            System.out.println("Mark: " + mark2);
            
        } catch (NumberFormatException e) { 
            // Part D Comment: getMarkAt(2) causes an exception because it tries to parse the word "absent" into an integer number.
            
            // Print simple error message
            System.out.println("Error: Selected mark is not a valid number.");
            
        } finally {
            // Print completion message
            System.out.println("Number conversion checking completed.");
        }

        // Print final continuation message after BOTH blocks
        System.out.println("Report checking completed.");
    }
}