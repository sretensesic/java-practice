package day_08_casting_conditionals;

import java.util.Scanner;

public class PhoneNum {

	public static void main(String[] args) {
		
	
	
	Scanner scan = new Scanner(System.in);
	
	
	
	int areaCode =  scan.nextInt();
	
	
	int localNumber = scan.nextInt();
	
	String phoneNumber = "("+areaCode+")-"+localNumber;
	
	 
  System.out.println("Calling number "+phoneNumber);
	
	
	
}
	
	
}
