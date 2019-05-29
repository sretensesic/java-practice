package day_47_blocks;

import java.time.LocalDateTime;

public class BriteERP {

	
	static{
		System.out.println("Launch Browser");
		System.out.println("Navigate to: " + TestData.url);
		//static block runs ONCE whenever the class is used
		//(creating object, call static method)
		
		//static bloc runs whenever a class is LOADED for use
		//CLASSLOADER loads the class to when it is used
	}
	
	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}
	
	public static void enterPassword() {
		System.out.println("Enter password: " + TestData.password);
	}
	
	public static void verifyLogin() {
		System.out.println("Expected Name: " + TestData.userName);
		System.out.println("Actual Name displayed: Viktoriia Lugovska");
		System.out.println("Login Successful - " + LocalDateTime.now());
	}
	
}
