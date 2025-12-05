/**
 * 
 */
package M2_ACTIVITY3;

/**
 * 
 */
public class SitWork01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WhiteBoard wb = new WhiteBoard();
	
		int sum = wb.addNumbers(1, 2);
		System.out.println("The total is:" + String.valueOf(sum));
		
	}
}

class WhiteBoard {

	
	int addNumbers(int addend1, int addend2) {
		int sum = addend1 + addend2;
		return sum;
	}

}

