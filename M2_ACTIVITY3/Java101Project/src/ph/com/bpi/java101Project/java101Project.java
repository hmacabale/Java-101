/**
 * 
 */
package ph.com.bpi.java101Project;
import java.util.Scanner;
/**
 * 
 */
public class java101Project {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== STUDENT GRADING SYSTEM =====\n");
		System.out.println("A - Add Student Information");
		System.out.println("B - Compute Student Average");
		System.out.println("C - Display Student Information");
		System.out.println("D - Exit");

	}

}



class StudentManagement {
    
    // Scanner object to handle user input within this class's methods
    private Scanner scanner;

    // Constructor to initialize the StudentManagement object
    public StudentManagement(Scanner scanner) {
        this.scanner = scanner;
    }

    public void addStudentInformation() {
        System.out.println("\n--- A: Add Student ---");
        System.out.print("Enter student name: ");
        String name = scanner.nextLine(); // Use nextLine to read the name
        
        System.out.print("Enter student ID: ");
        // If ID is an integer, you'd use scanner.nextInt() or Integer.parseInt(scanner.nextLine())
        String id = scanner.nextLine(); 
        
        System.out.println("Student " + name + " (ID: " + id + ") added successfully (Placeholder).");
    }

    public void computeStudentAverage() {
        System.out.println("\n--- B: Compute Average ---");
        // Placeholder for logic to compute averages
        System.out.println("Average computation logic executed (Placeholder).");
    }

    public void displayStudentInformation() {
        System.out.println("\n--- C: Display Info ---");
        // Placeholder for logic to display student data
        System.out.println("Displaying all student records (Placeholder).");
    }
}
