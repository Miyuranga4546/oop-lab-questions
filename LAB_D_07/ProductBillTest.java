package LAB_D_07;

public class ProductBillTest {
    
    public static void main(String[] args) {
        // Create the object with a valid price but invalid quantity text [cite: 165-167]
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            // Call calculateTotal() inside the try block [cite: 168]
            double total = bill.calculateTotal();
            System.out.println("Total Bill: " + total);
            
        } catch (NumberFormatException e) { // Catch the specific exception [cite: 169]
            // Part C: Short comment explaining why the exception occurs [cite: 173-174]
            // A NumberFormatException occurs here because Integer.parseInt() cannot convert the alphabetical word "two" into a numeric integer value.
            
            // Print the simple error message [cite: 170]
            System.out.println("Error: Price and quantity must be valid numbers.");
            
        } finally {
            // Print completion message [cite: 171]
            System.out.println("Product bill calculation completed.");
        }

        // Print final continuation message [cite: 172]
        System.out.println("Program continues...");
    }
}