/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
import java.util.Scanner;
public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students in the class: ");
        int totalStudents = input.nextInt();
        
       
        int presentCount = 0;
        int absentCount = 0;
        int currentStudent = 1; 
        
       
        while (currentStudent <= totalStudents) {
            System.out.print("Attendance for student " + currentStudent + " (1=present, 0=absent): ");
            int attendance = input.nextInt();
            
            if (attendance == 1) {
                presentCount++;    
                currentStudent++;  
            } else if (attendance == 0) {
                absentCount++;     
                currentStudent++;  
            } else {
                System.out.println("Error: Invalid input. Please enter 1 or 0.");
            }
        }
        
        System.out.println("-------------------------");
        System.out.println("Total present students: " + presentCount);
        System.out.println("Total absent students: " + absentCount);
        
        input.close();
    }
}
