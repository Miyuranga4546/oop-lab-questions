public class ProductTest {
    public static void main(String[] args) {
        
        // 1. Create one product object 
        Product product1 = new Product("Gaming Headset", 8500, 10);
        
        System.out.println("--- Initial State ---");
        System.out.println("Current Quantity: " + product1.getQuantity());
        
        // 2. Add stock [cite: 125]
        System.out.println("\nAdding 5 units to stock...");
        product1.addStock(5);
        System.out.println("Updated Quantity: " + product1.getQuantity()); // Should be 15
        
        // 3. Sell some units 
        System.out.println("\nSelling 3 units...");
        product1.sellProduct(3);
        
        // 4. Print the updated quantity 
        System.out.println("Updated Quantity after sale: " + product1.getQuantity()); // Should be 12
        
        // 5. Try to sell more than available and print a message [cite: 128]
        System.out.println("\nAttempting to sell 20 units...");
        int sellAmount = 20;
        
        if (sellAmount > product1.getQuantity()) {
            System.out.println("Warning: Cannot sell " + sellAmount + " units. The sell amount is greater than the available quantity!");
        } else {
            product1.sellProduct(sellAmount);
        }
        
        /* * EXPLANATION COMMENT:
         * Making attributes private is useful for Encapsulation or data hiding. 
         * It prevents other classes from directly changing the variables (like accidentally 
         * setting a negative quantity like product.quantity = -5). Instead, other classes 
         * must use controlled public methods like addStock() or sellProduct() which enforce rules.
         */
    }
}