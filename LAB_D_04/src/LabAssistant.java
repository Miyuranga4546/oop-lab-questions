/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class LabAssistant extends StaffMember {
    private int hoursWorked;
    private double hourlyRate;

    public LabAssistant(String fullName, String staffId, String department, int hoursWorked, double hourlyRate) {
        // Call the parent constructor
        super(fullName, staffId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }

    public void displayLabAssistantDetails() {
        // Call the inherited method first
        displayBasicDetails(); 
        System.out.println("Role: Lab Assistant");
        System.out.println("Hours Worked: " + hoursWorked);
        
        // Lab Requirement: Short comment explaining why 'department' can be used here
        // We can access 'department' directly in this child class because it was 
        // declared with the 'protected' access modifier in the StaffMember parent class
    }
}
