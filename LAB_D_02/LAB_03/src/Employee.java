/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class Employee extends Person {
    
    // Private attribute
    private double monthlySalary;

    // Public constructor to initialize both attributes
    public Employee(String fullName, double monthlySalary) {
        // super() calls the parent class (Person) constructor to set the fullName
        super(fullName); 
        this.monthlySalary = monthlySalary;
    }

    // Public method returning yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Public method displaying details
    public void displayEmployeeDetails() {
        // We can call this method because it is protected in the parent class
        displayPersonName(); 
        System.out.println("Yearly Salary: Rs. " + getYearlySalary());
    }
}
