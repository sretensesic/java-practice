package day_49_inheritance02_2;

import day_49_inheritance02.Device;
//IPad IS-A Device. IPad subclass in in a different package
public class iPad extends Device {
	public void readEBook(String title) {
		System.out.println("Reading a book" + title+" using " + brand + "tablet");
		System.out.println("Model - " + model);
		//System.out.println("Price: "+ price);  not visible
		// System.out.println("Made in: "+ country); not visible 
	}
	
}
