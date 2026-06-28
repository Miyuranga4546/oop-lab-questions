package LAB_D_07;

public class ProductBill {
    
    // Private attributes for the text inputs [cite: 153-157]
    private String priceText;
    private String quantityText;

    // Constructor to initialize both values [cite: 158]
    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    // Method to calculate the total by converting text to numbers [cite: 159-160]
    public double calculateTotal() {
        double price = Double.parseDouble(priceText);
        int quantity = Integer.parseInt(quantityText);
        return price * quantity;
    }
}