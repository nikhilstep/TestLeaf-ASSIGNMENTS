package week01.day01;

public class Car {
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void applyAcclerate() {
		System.out.println("Apply Acclerate");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car newCar=new Car();
		newCar.applyBreak();
		newCar.applyGear();
		newCar.applyAcclerate();

	}

}
