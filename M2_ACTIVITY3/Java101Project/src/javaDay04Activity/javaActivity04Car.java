package javaDay04Activity;

public class javaActivity04Car {
	
	public static void main(String[] args) {
		
		Car newCar = new Car();
	
		newCar.setCarBrand("Honda");
		newCar.setCarModel("Accord"); 
		newCar.setCarColor("Black");
        
        String model = newCar.getCarModel();
        System.out.println("The car model is: " + model);
        
        String carDtails = newCar.getCarDetails();
        System.out.println(carDtails);
	}
}



class Car{
	private String carColor;
	private String carModel;
	private String carBrand;
	
	
	public void setCarColor(String carColor) {
        // 'this.currentNumber' refers to the private instance field.
        this.carColor = carColor; 
    }
	
	public String getCarColor() {
        // 'this.currentNumber' refers to the private instance field.
        return this.carColor; 
    }
	
	public void setCarModel(String carModel) {
        // 'this.currentNumber' refers to the private instance field.
        this.carModel = carModel; 
    }
	
	public String getCarModel() {
        // 'this.currentNumber' refers to the private instance field.
        return this.carModel; 
    }
	
	public void setCarBrand(String carBrand) {
        // 'this.currentNumber' refers to the private instance field.
        this.carBrand = carBrand; 
    }
	
	public String getCarBrand() {
        // 'this.currentNumber' refers to the private instance field.
        return this.carBrand; 
    }
	
	public String getCarDetails() {
        return "Car Details: Brand=" + this.carBrand 
                + ", Model=" + this.carModel 
                + ", Color=" + this.carColor;
    } 
	
}