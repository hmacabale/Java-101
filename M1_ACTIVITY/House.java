/**
 * 
 */
package M1_ACTIVITY;

/**
 * 
 */
public class House {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewHouse house = new NewHouse();
		
		house.houseColor = "white";
		house.houseType = "Bungalow";

		String bookDetails = house.retrunDetails();
		System.out.println(bookDetails);

	}

}

class NewHouse{
	
	String houseColor;
	String houseType;
		
	public String retrunDetails() {
        return "The house is of type  " + this.houseType + " with color " + this.houseColor;

    } 
	
}