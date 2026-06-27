/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
import java.util.Scanner;
public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String[] names = new String[5];  
        
       
        for (int i = 0; i < 5; i++) {
           
            System.out.print("Enter student name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.println("-------------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + names[i]);                     
            System.out.println("Uppercase: " + names[i].toUpperCase()); 
            System.out.println("Length: " + names[i].length());         
        }
        
        input.close();
    }
}
