/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer (n): ");
        int n = input.nextInt();
        
        // Call our custom factorial method and store the returned answer
        int answer = factorial(n); 
        
        System.out.println(n + "! = " + answer);
        
        input.close();
    }
    
    // 2. This is the SEPARATE custom method to calculate the factorial
    static int factorial(int n) {
        int result = 1; // Start with 1 because multiplying by 0 gives 0
        
        // Loop from 1 up to n, multiplying the result each time
        for (int i = 1; i <= n; i++) {
            result = result * i; 
        }
        
        return result; // Send the final calculated number back to the main method
    }
}
