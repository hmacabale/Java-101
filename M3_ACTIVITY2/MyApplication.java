/**
 * 
 */
package M3_ACTIVITY2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 */
public class MyApplication {
	private static Scanner scanner = new Scanner(System.in);
	private static Set<String> products = new HashSet<>();

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<String> products = new ArrayList<>();
		//String option = scanner.nextLine();
		
		//String searchProduct = scanner.nextLine();
		//String addProduct = scanner.nextLine();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
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
                else if (option == 3)
                	printAllProducts();
            } else {
                System.out.println("\n❌ Invalid input. Please enter a number (1-4).");
                scanner.nextLine(); 
                option = 0; 
            }
            
        } while (option != 4);
        
        System.out.println("\nProgram Exited. Thank you!");
        scanner.close();


		
        
 
	}
	
	
	private static void displayMenu() {
        System.out.println("\n--- Product Set Operations ---");
        System.out.println("1. Search product");
        System.out.println("2. Add a product");
        System.out.println("3. Print all products and count");
        System.out.println("4. Exit");
        System.out.println("------------------------------");
    }
	
	
	private static void searchProduct() {
        System.out.print("Enter Product to search: ");
        String searchProduct = scanner.nextLine().trim();
        
        if (products.contains(searchProduct)) {
            System.out.println("Product found: " + searchProduct);
        } else {
            System.out.println("Product not found");
        }
    }
	
	private static void addProduct() {
        
        System.out.print("Enter Product Name: ");
        String newProduct = scanner.nextLine().trim();

        products.add(newProduct);
        System.out.println("\nProduct Added: " + newProduct);
    }
	
	private static void printAllProducts() {
        System.out.println("\n--- All Products ---");
        
        products.forEach(System.out::println);
        
        System.out.println("--------------------");
        System.out.println("Total Product Count: " + products.size());
    }

}
