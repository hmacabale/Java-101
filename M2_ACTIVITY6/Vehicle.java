/**
 * 
 */
package M2_ACTIVITY6;

/**
 * 
 */
public abstract class Vehicle {
	private String brand;
	private int numberOfWheels;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
        return brand;
    }
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public int getNumberOfWheels() {
        return numberOfWheels;
    }
	
	public abstract void startEngine();
	
    public void destroy() {
        System.out.println(this.brand + " vehicle with " + this.numberOfWheels + " wheels is now destroyed.");
    }

}
