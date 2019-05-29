package day_41_CustomClasses02;

public class MyCars {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();
		
		
		
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model="m3";
		bmw.showPrice();
		
		BMW bmw2 = new BMW();
		bmw2.model="m3";
		bmw2.showPrice();
	}
}
