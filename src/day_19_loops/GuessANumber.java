package day_19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();//is used to generate random numbers
	
		System.out.println("#### WELCOME TO A GUESS A NUMBER GAME ###");
		//this will give us numbers between 0 and 100
		int secretNumber = random.nextInt(101);
		int guessNumber = 0;
		
		do {
			System.out.println("Guess a number:");
			guessNumber = scan.nextInt();
			if(guessNumber < secretNumber) {
				System.out.println("Your number is too small!");
			}else {
				System.out.println("Your number is too large!");
			}
		
		
		}while(guessNumber != secretNumber);
		System.out.println("Bingo, Congrats, you won!!!");
	}
}
