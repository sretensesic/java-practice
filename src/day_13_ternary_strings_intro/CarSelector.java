package day_13_ternary_strings_intro;

import java.util.Scanner;

public class CarSelector {
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	
	double averagePrice = 0;
	int carType = 0;
	String carOptions = "";
	String carOrigins = "";
	
	
	System.out.println("Whoc type of car you are interetsed in:");
	
	System.out.println(" 1) American \n 2) German\n 3) Italian \n 4) Korean \n 5) Japanese");
	
	carType = scan.nextInt();
	
	switch(carType) {
	case 1:
		averagePrice = 34000.0;
		carOrigins = "American";
		carOptions = "Ford, Lincoln, Chevy";
	break;
	case 2:
		averagePrice = 45000.0;
		carOrigins = "Korean";
		carOptions = "Kia, Hyundai, Daewoo";
		break;
	case 3:
		averagePrice = 55000.0;
		carOrigins = "Italian";
		carOptions = "Ferrari, Lambo, FIAT, ALFA";
		break;
   default:
		System.out.println("Car type not available!");
		return;
	
	}
	
	
	System.out.println("You selected "+carOrigins+" and your options are "+carOptions);
	
	System.out.println("Average price is "+averagePrice+".");
	
}
}
