package day_41_CustomClasses02;

import java.util.ArrayList;

public class Car {
	String model;
	String make;
	int currentSpeed;
	String color;
	
	public void printCarInfo() {
		System.out.println("Car make: ["+ make+"] model: ["+model+"] color: ["+color+"] current speed: ["+currentSpeed+"]");
	}
	public void showCurrentSpeed(int SpeedLimit) {
		System.out.println(make+" is driving at "+currentSpeed+" mph, following speed limit - "+SpeedLimit);

		
	}
}
