/**
 * 
 */
package M3_ACTIVITY4;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 */
public class MyApplication {

	/**
	 * @param args
	 */
	
    private Queue<Products> checkoutQueue = new LinkedList<>();
    private double totalBill = 0.0;
    private Scanner sc = new Scanner(System.in);
    
    // Counter to ensure initial products have unique prices for simplicity
    //private int initialPriceCounter = 100;
    
    public void start() {
    initializeProducts();
    
    System.out.println("--- Cashier Checkout Line Initialized ---");
    
    int choice = 0;
    do {
        displayMenu();
        
        // Handle input safely
        try {
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine()); 

            if (choice == 1) {
                addProduct(sc);
            } else if (choice == 2) {
                processNextProduct();
            } else if (choice == 3) {
                checkNumberOfProducts();
            } else if (choice == 4) {
                viewTotalBill();
            } else if (choice == 5) {
                exitProgram();
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1-5.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

    } while (choice != 5);
    
    // Final resource cleanup
    sc.close();
}

 

	private void initializeProducts() {
        // Create 5 initial products and add them to the queue
        checkoutQueue.offer(new Products("Laptop", 50000.00));
        checkoutQueue.offer(new Products("Mouse", 500.00));
        checkoutQueue.offer(new Products("Keyboard", 1000.00));
        checkoutQueue.offer(new Products("Monitor", 5000.00));
        checkoutQueue.offer(new Products("Printer", 6000.00));
    }
    
    private void displayMenu() {
        System.out.println("\n--- Cashier Checkout Menu ---");
        System.out.println("1. Add a product");
        System.out.println("2. Process next product");
        System.out.println("3. Check number of products in queue");
        System.out.println("4. View total bill so far");
        System.out.println("5. Exit");
    }
    
    
 // --- Option 1: Add a product ---
    private void addProduct(Scanner sc) {
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter product price (P): ");
        String priceInput = sc.nextLine(); 
        

            double price = Double.parseDouble(priceInput);
            
            if (price < 0) {
                 System.out.println("Price cannot be negative. Product not added.");
                 return;
            }
            
            Products newProduct = new Products(name, price);
            checkoutQueue.offer(newProduct);
            
            System.out.println("Product added to checkout line: " + newProduct.getName());
            
       
    }

    // --- Option 2: Process next product ---
    private void processNextProduct() {
        if (checkoutQueue.isEmpty()) {
            System.out.println("The checkout line is empty. Nothing to process.");
            return;
        }

        // Remove the first product from the queue 
        Products processedProduct = checkoutQueue.poll(); 
        
        // Add the price to the total bill
        totalBill += processedProduct.getPrice();
        
        System.out.println("Processed: " + processedProduct.getName() + " (P" + String.format("%.2f", processedProduct.getPrice()) + ")");
        System.out.println("Total bill: P" + String.format("%.2f", totalBill));
    }

    // --- Option 3: Check number of products ---
    private void checkNumberOfProducts() {
        int count = checkoutQueue.size();
        System.out.println("Currently waiting in the queue: " + count + " product(s).");
    }

    // --- Option 4: View total bill ---
    private void viewTotalBill() {
        System.out.println("Total bill so far: P" + String.format("%.2f", totalBill));
    }
    
    // --- Option 5: Exit ---
    private void exitProgram() {
        // Process any remaining items in the queue
        while (!checkoutQueue.isEmpty()) {
            processNextProduct();
        }
        
        System.out.println("\nClosing cashier line...");
        System.out.println("Final total bill: P" + String.format("%.2f", totalBill));
    }

}
