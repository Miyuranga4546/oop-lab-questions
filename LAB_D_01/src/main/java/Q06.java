/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
import java.util.Scanner;
public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter mark: ");
        int mark = input.nextInt();
        
        if (mark >= 0 && mark <= 100) {
            
            // 2. If valid, determine the grade using else-if
            if (mark >= 75) {
                System.out.println("A"); // 75 and above 
            } else if (mark >= 65) {
                System.out.println("B"); // 65 to 74 
            } else if (mark >= 55) {
                System.out.println("C"); // 50 to 64 
            } else if (mark >= 40) {
                System.out.println("S"); // 40 to 54 
            } else {
                System.out.println("F"); // below 40 
            }
            
        } else {
            // 3. If the mark is outside the 0-100 range
            System.out.println("Invalid mark"); 
        }
        
        input.close();
    }
}
