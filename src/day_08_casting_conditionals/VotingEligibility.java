package day_08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
	 	int votingAge = 18;
		
		System.out.println("How old are you?");
		
		int yourAge = scan.nextInt();
		int years = yourAge - votingAge; 
		
		if (yourAge >= votingAge){
				 System.out.println("Youre eligible to vote");
		 System.out.println("You have been eligible for "+years+" years");
		 }else {
			 int moreYears = votingAge - yourAge;
			 System.out.println("youre not eligible to vote");
		System.out.println("you still have "+(-years)+" to go");
		
		 }
		
		
	}
	
	

}
