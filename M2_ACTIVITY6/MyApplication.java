/**
 * 
 */
package M2_ACTIVITY6;

/**
 * 
 */
public class MyApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Car myCar = new Car("Honda");
        Truck myTruck = new Truck("Isuzu");
        
        myTruck.startEngine(); 
        myTruck.refuel();      
        
        myCar.startEngine(); 
        myCar.refuel();
        
        //destroyVehicle(myCar); 
        destroyVehicle(myTruck);
	}

	private static void destroyVehicle(Vehicle motor) {
		motor.setBrand("Toyota");
		motor.setNumberOfWheels(10);
		motor.destroy();
	}
}


