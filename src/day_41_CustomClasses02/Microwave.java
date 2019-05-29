package day_41_CustomClasses02;

public class Microwave {
	
	String brand;
	boolean isOn;
	 
	public void turnOn() {
		if(isOn != true) {
		System.out.println("Turning on the "+brand+" microwave");
	}else {
		System.out.println(brand+" is already on");
		isOn=true;
	}
	}
	public void turnOff() {
		if(isOn != true) {
			System.out.println("It is already off");
		}else {
			System.out.println("Microwave is turning off");
			isOn=false;
		}
	}
	public void heat(String food) {
		if(isOn == true) {
			System.out.println("Food has been heating");
		}else {
			System.out.println("Turn on the microwave to heat your food");
		}
	}
}
