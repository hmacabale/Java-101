/**
 * 
 */
package M3_ACTIVITY1;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 */
public class ProductsList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> products = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("All Products:");
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		for (int i = 0; i < products.size(); i++) {
            String product = products.get(i);
            System.out.println(i + ": " + product);
        }
		
		System.out.println("\nAfter removing and adding products:");
		
		products.remove(1);
		products.add("Webcam");

		
		for (int i = 0; i < products.size(); i++) {
            String product = products.get(i);
            System.out.println(i + ": " + product);
        }
		
		System.out.println("\nEnter Product name to search:");
        String searchProduct = scanner.nextLine();
        
        if (products.contains(searchProduct)) {
            System.out.println("Product found: " + searchProduct);
        } else {
            System.out.println("Product not found");
        }
        
        scanner.close();

	}

}
