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
        
        // 1. Create one employee object
        Employee emp1 = new Employee("Nuwan Samarasinghe", 75000);
        
        // 2. Call displayEmployeeDetails()
        System.out.println("--- Employee Info ---");
        emp1.displayEmployeeDetails();
        
        /* * EXPLANATION COMMENT:
         * The attribute 'fullName' and method 'displayPersonName()' can be used 
         * inside the child class (Employee) because they are declared as 'protected' 
         * in the parent class (Person). The 'protected' modifier allows access within 
         * the same package AND to any child subclasses, even if they are in different packages.
         */
    }
    
}
