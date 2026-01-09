/**
 * 
 */
package M4_ACTIVITY5;

/**
 * 
 */

@SuppressWarnings("serial")
class InvalidAccountNumberException extends Exception {
    public InvalidAccountNumberException(String message) {
        super(message);
    }
}

// Unchecked Exception (extends RuntimeException)
@SuppressWarnings("serial")
class InvalidAccountFormatException extends RuntimeException {
    public InvalidAccountFormatException(String message) {
        super(message);
    }
}


public class AccountValidator {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {

		System.out.println("=== Account Number Validation Test ===\n");

        testValidation("Test 1: Valid account (1234567890)", "1234567890");
        testValidation("Test 2: Too short (123)", "123");
        testValidation("Test 3: Contains letters (12345ABC90)", "12345ABC90");
        testValidation("Test 4: Contains space (1234 567890)", "1234 567890");
        testValidation("Test 5: Null value", null);
    }

	
public static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
        
        // 1. Check for null
        if (accountNumber == null) {
            throw new NullPointerException("Account number cannot be null");
        }

        // 2. Check format for non-digits
        for (char c : accountNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidAccountFormatException("Account number must contain only digits");
            }
        }

        // 3. Check length
        if (accountNumber.length() != 10) {
            throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
        }

        // 4. If valid
        System.out.println("Valid account number: " + accountNumber);
    }

	
	public static void testValidation(String testName, String accountNumber) {
        System.out.println(testName);
        try {
            validateAccountNumber(accountNumber);
        } catch (InvalidAccountNumberException e) {
            // Checked exception error message
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAccountFormatException | NullPointerException e) {
            // Unchecked exceptions warning message
            System.out.println("Warning: " + e.getMessage());
        }
        System.out.println(); // Space for readability
    }

}
