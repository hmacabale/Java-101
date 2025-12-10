/**
 * 
 */
package M2_ACTIVITY6;

/**
 * 
 */
public class Car extends Vehicle implements Refuelable {
	
	public Car(String brand) {
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
