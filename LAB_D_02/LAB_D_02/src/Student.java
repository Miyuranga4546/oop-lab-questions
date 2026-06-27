public class Student {
    // Instance variables
    String name;
    String registrationNumber;
    double marks;

    // Constructor
    public Student(String studentName, String regNum, double studentMarks) {
        name = studentName;
        registrationNumber = regNum;
        marks = studentMarks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name + " | Reg No: " + registrationNumber + " | Marks: " + marks);
    }

    // Method to check if the student passed
    public boolean isPass() {
        if (marks >= 40) {
            return true;
        } else {
            return false;
        }
    }

    // Method to determine the grade
    public String getGrade() {
        if (marks >= 75) {
            return "A";
        } else if (marks >= 65) {
            return "B";
        } else if (marks >= 55) {
            return "C";
        } else if (marks >= 40) {
            return "S";
        } else {
            return "F";
        }
    }
}