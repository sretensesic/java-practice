package day_20_forLoop;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = scan.nextInt();
		//check if it is valid 1 - 10
		//if it not valid - return
	
		//for loop to print multiplication table
		if(num < 1 || num > 10) {
			System.out.println("ERROR: Invalid input");
			return;
		 //System.exit(0);   will also work
		}
		 
		//for loop to print multiplication table
		for(int bum = 1; bum <= 10; bum++) {
			System.out.println(num+" x "+bum+" = "+(num*bum));
		 
		 }
		
	
	
	
	
	}
}
