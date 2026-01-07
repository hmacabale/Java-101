/**
 * 
 */
package M4_ACTIVITY1;

/**
 * 
 */
public class BankAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=== Bank Account Name Display ===");
        System.out.println();

        // Test with a valid account
        testCase("ACC-01");

        // Test with an invalid account (this triggers the catch block)
        testCase("ACC-999");

        System.out.println("=== Program completed successfully! ===");

	}
	
	
	public static String getAccountName(String accountNumber) {
        if (accountNumber.equals("ACC-01")) {
            return "Juan Dela Cruz";
        } else if (accountNumber.equals("ACC-02")) {
            return "Maria Santos";
        } else {
            // Returns null if the account doesn't match the IDs above
            return null;
        }
    }
	
	public static void testCase(String accountNumber) {
        System.out.println("Looking up account: " + accountNumber);

        try {

            String name = getAccountName(accountNumber);
            String upperName = name.toUpperCase();
            
            System.out.println("Account holder: " + upperName);
            
        } catch (NullPointerException e) {
            // This code runs only if getAccountName returned null
            System.out.println("Error: Account not found!");
        }
        
        // Extra space for readability in the console
        System.out.println(); 
    }

}
