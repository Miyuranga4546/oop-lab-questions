/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class EmployeeTest {
   public static void main(String[] args) {
        // Create 2 employee objects
        Employee emp1 = new Employee("Nimal", "Perera", 50000.0);
        // Let's test the negative salary logic on the second employee just to see it work!
        Employee emp2 = new Employee("Sunil", "Fernando", 65000.0); 

        //Display each employees yearly salary initially
        System.out.println("--- Initial Yearly Salaries ---");
        System.out.println(emp1.firstName + "'s Yearly Salary: Rs. " + emp1.getYearlySalary());
        System.out.println(emp2.firstName + "'s Yearly Salary: Rs. " + emp2.getYearlySalary());

        // Give each employee a 10% raise
        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        // Display each employees yearly salary again
        System.out.println("\n--- Yearly Salaries After 10% Raise ---");
        System.out.println(emp1.firstName + "'s Yearly Salary: Rs. " + emp1.getYearlySalary());
        System.out.println(emp2.firstName + "'s Yearly Salary: Rs. " + emp2.getYearlySalary());

        // Print the name of the employee who has the higher yearly salary
        System.out.println("\n--- Highest Earner ---");
        
        if (emp1.getYearlySalary() > emp2.getYearlySalary()) {
            System.out.println(emp1.firstName + " " + emp1.lastName + " has the higher yearly salary.");
        } else if (emp2.getYearlySalary() > emp1.getYearlySalary()) {
            System.out.println(emp2.firstName + " " + emp2.lastName + " has the higher yearly salary.");
        } else {
            System.out.println("Both employees have the exact same yearly salary.");
        }
    } 
}
