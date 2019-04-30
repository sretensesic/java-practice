package day_19_loops;

import java.util.Scanner;

public class EnterPassword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	String password = "abcd123";
	String input;
	
	do {
		System.out.println("Enter password");
		input = scan.next();
	}while(!input.contentEquals(password));
	
	
	
	
	}
}
