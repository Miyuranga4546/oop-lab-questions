public class StudentTest {
    public static void main(String[] args) {
        
        // Create an array that can store 5 Student objects
        Student[] studentArray = new Student[5];

        // Create 5 student objects and store them in the array
        studentArray[0] = new Student("Miyuranga", "REG1001", 88);
        studentArray[1] = new Student("Amal", "REG1002", 35); // Failed
        studentArray[2] = new Student("Kamal", "REG1003", 68);
        studentArray[3] = new Student("Nimal", "REG1004", 95); // Highest
        studentArray[4] = new Student("Sunil", "REG1005", 42);

        // Variables to keep track of our counts and highest marks
        int passedCount = 0;
        double highestMarks = studentArray[0].marks;
        String topStudentName = studentArray[0].name;

        System.out.println("--- All Student Details ---");

        // Use a loop to process all students
        for (int i = 0; i < studentArray.length; i++) {
            
            // Display details
            studentArray[i].displayDetails();

            // Check if passed and update the count
            if (studentArray[i].isPass()) {
                passedCount++;
            }

            // Check for highest marks
            if (studentArray[i].marks > highestMarks) {
                highestMarks = studentArray[i].marks;
                topStudentName = studentArray[i].name;
            }
        }

        // Print the results after the loop finishes
        System.out.println("\n--- Final Results ---");
        System.out.println("Total students who passed: " + passedCount);
        System.out.println("Student with the highest marks: " + topStudentName);
    }
}