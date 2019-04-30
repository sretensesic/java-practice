package day_08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int passingPercentage = 65;
		System.out.println("What is your score?");
		int ScorePercentage = scan.nextInt();
		
		if(ScorePercentage >= passingPercentage) {
			System.out.println("Passed your test");
		}else {
		System.out.println("Not enough. Come back");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
