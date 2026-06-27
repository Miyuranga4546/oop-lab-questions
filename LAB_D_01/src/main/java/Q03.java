/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */

import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = input.nextLine();
       
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        System.out.println("Student " + name + " is " + age + " years old.");
        
        input.close();
    }
}
