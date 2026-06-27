/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class Person {
   // Protected attribute
    protected String fullName;

    // Protected constructor
    protected Person(String fullName) {
        this.fullName = fullName;
    }

    // Protected method
    protected void displayPersonName() {
        System.out.println("Employee Name: " + fullName);
    } 
}
