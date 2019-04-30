package day_09;

import java.util.Scanner;

public class Canada {

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("What is the capital of Canada?");
	String capital = scan.nextLine();
	
	//Check if the answer is correct.
	if(capital.equalsIgnoreCase("Ottawa")) {
		System.out.println("Your answer is correct!");
	}else {
		System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada!");
	} 


	/*  equalsIgnore method of String, will not worry about lower or uppercase  difference when checking for 
	equality.*/
	
	 
}
}
