package day_49_inheritance02_2;

import day_49_inheritance02.Device;

//Non - sub classs in different package
public class OverSeasFactory {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "Samsung";
		//dv.model = "3200"; not visible  because...
		//dv.price = 1000;  not visible
		//dv.country = "El Salvador"; not visible
		
		
	}
}
