/**
 * 
 */
package M2_ACTIVITY6;

/**
 * 
 */
public class Truck extends Vehicle implements Refuelable {

	public Truck(String brand) {
		this.setBrand(brand);
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println(getBrand() + " is getting a full tank");
		
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(getBrand() + " is starting its engine");
		
	}

}
