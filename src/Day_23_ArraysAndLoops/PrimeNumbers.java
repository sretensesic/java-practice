package day_23_ArraysAndLoops;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	
	int num = scan.nextInt();
	 for(int c = 2; c <= num; c++) {
		 if(num % c == 0) {
			 System.out.println("This is not a prime number");
			 return;
		 }
	 }
	
	System.out.println("This is a prime number!");
	
	
	
	}
}
