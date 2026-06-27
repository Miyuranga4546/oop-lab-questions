/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */ 
// Comment :-
// A final class cannot be inherited to prevent child classes from altering or overriding its core rules. This ensures that strict policies remain secure and consistent.

public final class UniversityPolicy {
    // static final variables are constants, usually written in ALL_CAPS
    public static final String UNIVERSITY_NAME = "University of Kelaniya";
    public static final double BONUS_RATE = 0.10; // Let's assume a 10% bonus rate

    public static void showPolicyHeader() {
        System.out.println("=== " + UNIVERSITY_NAME + " Official Policy ===");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}