/**
 * 
 */
package M3_ACTIVITY4;

/**
 * 
 */

public class Products {
    private String name;
    private double price;

    // Constructor to easily create a Product object
    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Optional: toString for easy printing
    @Override
    public String toString() {
        return name + " (P" + String.format("%.2f", price) + ")";
    }
}
