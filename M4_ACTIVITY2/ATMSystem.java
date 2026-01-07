/**
 * 
 */
package M4_ACTIVITY2;


/**
 * 
 */
public class ATMSystem {
	static double[] accounts = {10000, 15000, 20000};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=== ATM Withdrawal System ===");
        System.out.println();

        // Test 1: Success
        System.out.println("--- Test 1: Valid Withdrawal ---");
        processWithdrawal("1", "5000");

        // Test 2: NumberFormatException
        System.out.println("--- Test 2: Invalid Account Index ---");
        processWithdrawal("abc", "5000");

        // Test 3: ArrayIndexOutOfBoundsException
        System.out.println("--- Test 3: Account Not Found ---");
        processWithdrawal("10", "5000");

        // Test 4: Insufficient Funds
        System.out.println("--- Test 4: Insufficient Funds ---");
        processWithdrawal("1", "20000");

        System.out.println("=== All tests completed! ===");

	}
	
	
	public static void processWithdrawal(String accountIndex, String amountInput) {
        try {
            // Parse accountIndex to int
            int index = Integer.parseInt(accountIndex);
            
            // Get balance from array
            double balance = accounts[index];
            
            // Parse amountInput to double
            double amount = Double.parseDouble(amountInput);

            System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
            System.out.println("Current balance: ₱" + balance);

            // Check if amount > balance
            if (amount > balance) {
                System.out.println("Withdrawal: ₱" + amount);
                System.out.println("Insufficient funds! Cannot withdraw ₱" + amount);
            } else {
                // Otherwise, calculate new balance and print success
                double newBalance = balance - amount;
                System.out.println("Withdrawal: ₱" + amount);
                System.out.println("New balance: ₱" + newBalance);
                System.out.println("Withdrawal successful!");
            }

        } catch (NumberFormatException e) {
            // Catch bad numeric input
            System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
            System.out.println("Error: Invalid input!");
            System.out.println("Please enter valid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch invalid account index
            System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
        } catch (Exception e) {
            // Catch-all for any other errors
            System.out.println("Error: Transaction failed");
        }
        System.out.println(); 
    }

}
