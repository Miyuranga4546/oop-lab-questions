/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
// StaffMember is abstract because it serves as a general template.
// We shouldn't create a generic "StaffMember" object directly, a person must be a specific role like a Lecturer.

public abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;

    // --- NEW Q5 CODE: Static variable and comment ---
    // Lab Report question:-
    // staffCount is static because it belongs to the class itself, not to any individual object.
    // It keeps track of the total number of staff members created across all instances.
    private static int staffCount = 0;
    
    
    // A public constructor to initialize all three values
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department; 
        
        // --- NEW Q5 CODE: Increase count when an object is created ---
        staffCount++;
    }

    // Public getter methods
    public String getFullName() { return fullName; }
    public String getStaffId() { return staffId; }
    public String getDepartment() { return department; }

    // Public final method to print common details
    public final void displayBasicDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    // Abstract method for monthly payment calculation
    public abstract double calculateMonthlyPayment(); 
    // --- NEW Q5 CODE: Static methods ---
    public static void showSystemName() {
        System.out.println("--- Campus Staff Payment System ---");
    }

    public static int getStaffCount() 
    {
        return staffCount;
    } 
    
    // Lab Report Question Answer:-
    // This method encapsulates the update logic. Instead of allowing external code  to directly 
    // change the department variable to potentially invalid data, this method acts as a gatekeeper, 
    // ensuring the update only happens if the new department string is valid (not empty).
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.trim().isEmpty()) {
            this.department = newDepartment;
            System.out.println(">> System Update: " + this.getFullName() + "'s department successfully changed to " + newDepartment);
        } else {
            System.out.println(">> Error: Invalid department name provided for " + this.getFullName());
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice for " + getFullName() + ": Please review the updated university guidelines.");
    }
}
