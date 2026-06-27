/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
import java.util.Scanner;
public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declare a 2D array for 3 students (rows) and 2 subjects (columns)
        int[][] marks = new int[3][2];
        
        // 1. Get the inputs using nested loops
        for (int i = 0; i < 3; i++) {           // Outer loop for Students
            for (int j = 0; j < 2; j++) {       // Inner loop for Subjects
                System.out.print("Enter mark for Student " + (i + 1) + ", Subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
            }
        }
        
        System.out.println("-------------------------");
        
        // 2. Print all marks in row and column form
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                // Use print() instead of println() to keep marks on the same row
                System.out.print(marks[i][j] + " "); 
            }
            // Move to the next line after printing all subjects for one student
            System.out.println(); 
        }
        
        System.out.println("-------------------------");
        
        // 3. Calculate and print the total marks for each student
        for (int i = 0; i < 3; i++) {
            int total = 0; // Reset total to 0 for each new student
            for (int j = 0; j < 2; j++) {
                total += marks[i][j]; // Add the subject mark to the total
            }
            System.out.println("Student " + (i + 1) + " Total: " + total);
        }
        
        input.close();
    }
    
}
