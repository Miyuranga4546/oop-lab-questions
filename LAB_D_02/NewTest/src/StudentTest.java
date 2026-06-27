/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class StudentTest {
    public static void main(String[] args) {
        // Creating one Student object
        Student student1 = new Student();

        // Assigning values to all three fields
        student1.name = "Miyuranga";
        student1.registrationNumber = "REG1001";
        student1.marks = 88.5;

        // Printing the values of all fields
        System.out.println("Student Name: " + student1.name);
        System.out.println("Registration Number: " + student1.registrationNumber);
        System.out.println("Marks: " + student1.marks);

        /*
         * Answers to Question 1 Identifications:
         * - What is the class name? Student
         * - What is the object name? student1
         */
    }
}
