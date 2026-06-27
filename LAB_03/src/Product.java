/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class Product {
    private String productName;
    private double price;
    private int quantity;

    // Parameterized constructor to initialize values
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Public method to print the product details
    public void displayDetails()  {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
    }
    // New Methods For Q02

    // Returns the product name
    public String getProductName() {
        return productName;
    }

    // Returns price * quantity
    public double getStockValue() {
        return price * quantity;
    }

    // Returns true if quantity is greater than 0, otherwise false
    public boolean isAvailable() {
        return quantity > 0;
    }
    
// New Method For Q03
// Static method that prints the store name
    public static void showStoreName() {
        System.out.println("Store Name: TechMart Electronics");
    }
    // --- NEW METHODS FOR QUESTION 4 ---

    // Public method to increase the quantity [cite: 120]
    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }

    // Public method to reduce quantity only if enough stock is available [cite: 121]
    public void sellProduct(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            // Failsafe message inside the object
            System.out.println("Transaction Failed: Not enough stock inside the inventory.");
        }
    }

    // Public method to return the current quantity [cite: 122]
    public int getQuantity() {
        return quantity;
    }
}

