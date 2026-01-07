/**
 * 
 */
package M4_ACTIVITY3;

/**
 * 
 */
public class ATMTransaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- ATM BALANCE INQUIRY SYSTEM ---\n");

        // Test Case 1: Valid Savings Account
        System.out.println("--- Test Case 1: Valid Savings Account ---");
        checkBalance("100123456", 15000.00);

        // Test Case 2: Valid Checking Account
        System.out.println("--- Test Case 2: Valid Checking Account ---");
        checkBalance("200987654", 25000.00);

        // Test Case 3: Invalid Account Number Format (letters)
        System.out.println("--- Test Case 3: Invalid Account Number Format ---");
        checkBalance("ABC12345", 15000.00);

        // Test Case 4: Empty Account Number
        System.out.println("--- Test Case 4: Empty Account Number ---");
        checkBalance("", 15000.00);

	}
	
	
	
	public static void checkBalance(String accountNumber, double balance) {
        try {
            // Inside the try block:
            System.out.println("Processing balance inquiry...");

            // Validate account number format by converting to integer
            // This will throw NumberFormatException if accountNumber has letters
            Integer.parseInt(accountNumber);

            // Get account type from first character
            // This will throw StringIndexOutOfBoundsException if accountNumber is empty ("")
            char accountTypeChar = accountNumber.charAt(0);

            // Determine account type name
            if (accountTypeChar == '1') {
                System.out.println("Account Type: Savings");
            } else if (accountTypeChar == '2') {
                System.out.println("Account Type: Checking");
            } else {
                System.out.println("Account Type: Unknown");
            }

            // Print balance details
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: ₱" + balance);
            System.out.println("Balance inquiry successful!");

        } catch (NumberFormatException e) {
            // catch bad numeric format
            System.out.println("Error: Invalid account number format! Account numbers must be numeric.");
        } catch (StringIndexOutOfBoundsException e) {
            // catch empty string input
            System.out.println("Error: Account number is empty or invalid!");
        } finally {
            // Write finally block (ALWAYS executes)
            System.out.println("\n========== RECEIPT ==========");
            System.out.println("Transaction Date: December 3, 2025");
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location: Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println("=============================\n");
        }
    }

}
