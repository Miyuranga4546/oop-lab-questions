public class Lab04Main {
    public static void main(String[] args) {
        
        //  Shows the system name [Q6 Requirement]
        StaffMember.showSystemName();
        System.out.println();
        
        // Shows the university policy header [Q6 Requirement]
        UniversityPolicy.showPolicyHeader();
        System.out.println("Institution: " + UniversityPolicy.UNIVERSITY_NAME);
        System.out.println(); 
        
        // Continues using the same 3 staff objects created in Question 5 [Q6 Requirement]
        Lecturer lec1 = new Lecturer("Dr. Nimesh Perera", "LEC-001", "Computer Science", 3, 50000);
        Lecturer lec2 = new Lecturer("Dr. Kasun Bandara", "LEC-002", "Physics", 2, 45000); 
        LabAssistant lab1 = new LabAssistant("Luvin Adithya", "LAB-001", "Zoology", 120, 1500);
        
        // Changes the department of one object using changeDepartment(...) [Q6 Requirement]
        System.out.println("--- Department Updates ---");
        lec1.changeDepartment("Artificial Intelligence"); // Valid change
        lec2.changeDepartment(""); // Invalid change (testing the encapsulation!)
        System.out.println();
        
        //  Displays all 3 staff members [Q6 Requirement]
        System.out.println("--- Final Staff Details ---");
        lec1.displayLecturerDetails();
        System.out.println();
        lec2.displayLecturerDetails();
        System.out.println();
        lab1.displayLabAssistantDetails();
        System.out.println();
        
        //  Prints the monthly payment of all 3 [Q6 Requirement]
        System.out.println("--- Monthly Payments ---");
        double lec1Pay = lec1.calculateMonthlyPayment();
        double lec2Pay = lec2.calculateMonthlyPayment();
        double lab1Pay = lab1.calculateMonthlyPayment();
        
        System.out.println(lec1.getFullName() + ": Rs." + lec1Pay);
        System.out.println(lec2.getFullName() + ": Rs." + lec2Pay);
        System.out.println(lab1.getFullName() + ": Rs." + lab1Pay);
        System.out.println();
        
        //  Prints the total monthly payment [Q6 Requirement]
        double totalMonthlyPayment = lec1Pay + lec2Pay + lab1Pay;
        System.out.println(">> Total Monthly Payment for all staff: Rs." + totalMonthlyPayment);
        System.out.println();

        //  Prints the total number of created staff objects [Q6 Requirement]
        System.out.println(">> Total Staff Members Created: " + StaffMember.getStaffCount());
        System.out.println();
        
        //  Calls showCommonNotice() for all 3 [Q6 Requirement]
        System.out.println("--- Common Notices ---");
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        lab1.showCommonNotice();
    }
}