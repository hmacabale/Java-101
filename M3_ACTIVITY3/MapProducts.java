/**
 * 
 */
package M3_ACTIVITY3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 
 */
public class MapProducts {
	private static Scanner scanner = new Scanner(System.in);
	static Map<String, Double> productToPriceMap = new HashMap<>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		productToPriceMap.put("Laptop", 30000D);
		productToPriceMap.put("Mouse", 500.00D);
		productToPriceMap.put("Keyboard", 800.00D);
		productToPriceMap.put("Monitor", 3000.00D);
		productToPriceMap.put("Printer", 5000.00D);

		
		int option = 0;
		do {
            displayMenu();
            System.out.print("Select an option: ");
            
            if (scanner.hasNextInt()) {
            	option = scanner.nextInt();
                scanner.nextLine();
                
                if (option == 1) {
                	searchProduct();
                }
                else if (option == 2) {
                	addProduct();
                }
                else if (option == 3) {
                	printAllProducts();
                } 
                else if (option == 4) {
                	findCheapestProduct();
                } 
           
            }  else {
                System.out.println("\n❌ Invalid input. Please enter a number (1-4).");
                scanner.nextLine(); 
                option = 0; 
            }
            
        } while (option != 5);
        
        System.out.println("\nProgram Exited. Thank you!");
        scanner.close(); 
	}   
	
	private static void displayMenu() {
        System.out.println("\n--- Product Set Operations ---");
        System.out.println("1. Search product");
        System.out.println("2. Add a product");
        System.out.println("3. Print all products and prices");
        System.out.println("4. Find the cheapest product");
        System.out.println("5. Exit");
        System.out.println("------------------------------");
    }
	
	
	private static void searchProduct() {
        System.out.print("Enter Product to search: ");
        String searchProduct = scanner.nextLine().trim();
        
        if (productToPriceMap.containsKey(searchProduct)) {
            System.out.println("Product found: " + searchProduct);
        } else {
            System.out.println("Product not found");
        }
    }
	
	private static void findCheapestProduct() {
        
        Comparator<Entry<String, Double>> priceComparator = Comparator.comparing(Entry::getValue);
        Entry<String, Double> cheapestEntry = Collections.min(productToPriceMap.entrySet(),priceComparator);
        
        System.out.println("The Cheapest Product Found:");
        System.out.println("Product: " + cheapestEntry.getKey());
        System.out.println("Price:   P" + String.format("%.2f", cheapestEntry.getValue()));
	}
		
	private static void addProduct() {
        
        System.out.print("Enter Product Name: ");
        String newProduct = scanner.nextLine().trim();
        
        System.out.print("Enter Product Price: ");
        String price = scanner.nextLine();

        productToPriceMap.put(newProduct, Double.parseDouble(price));
        System.out.println("\nProduct Added: " + newProduct + "  "  +  price);
    }

	private static void printAllProducts() {
        System.out.println("\n--- All Products ---");
        
        for (Entry<String, Double> entry : productToPriceMap.entrySet()) {
        	System.out.println(entry.getKey() + " : " + entry.getValue() );
        }
        
        System.out.println("--------------------");
        //System.out.println("Total Product Count: " + products.size());

	}
}
