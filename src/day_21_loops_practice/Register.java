package day_21_loops_practice;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String items = "";
		
		System.out.println("Welcome, how many items  are you purchasing today?");
		int itemCount = scan.nextInt();
		double totalPrice = 0.0;
		for(int count = 1; count <= itemCount; count++) {
			System.out.println("What is item "+ count+"?");
			String itemName = scan.next();
			System.out.println("How much is "+itemName+"?");
			double itemPrice = scan.nextDouble();

			items += itemName + ", "; 
			totalPrice += itemPrice;
			//if item end '.' than get rid of comma
		}
		
		System.out.println("Your items: " + items);
		System.out.println("Your total price: "+ totalPrice);
	
}
}