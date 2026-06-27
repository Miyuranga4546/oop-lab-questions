/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class Employee {
    // Instance variables
    String firstName;
    String lastName;
    double monthlySalary;

    // Constructor to initialize variables
    public Employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;
        
        // If the salary is not positive, store 0.0
        if (salary > 0.0) {
            monthlySalary = salary;
        } else {
            monthlySalary = 0.0;
        }
    }

    // Method to return the yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to increase the monthly salary by a percentage
    public void raiseSalary(double percentage) {
        double increaseAmount = monthlySalary * (percentage / 100);
        monthlySalary = monthlySalary + increaseAmount;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee: " + firstName + " " + lastName + " | Monthly Salary: Rs. " + monthlySalary);
    }
}
