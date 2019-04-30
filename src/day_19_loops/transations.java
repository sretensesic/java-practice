package day_19_loops;

import java.util.Scanner;

public class transations {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("What is your current balance?");
	double balance = scan.nextDouble();
	int count = 0;
	
	
	while(balance > 0) {
	count++; //increase by 1
		System.out.println("What is transction#"+count+"ammount?");
		double transaction = scan.nextDouble();
		//balance = balance - transaction;
		if(transaction > balance) {
	System.out.println("Your balance is about to be negative due this tranasaction");
		}	
	balance -= transaction;
		System.out.println("Your current ballance is:"+balance);
	}
	System.out.println("You have insufficient fund. Your balance is:"+balance);
	System.out.println("Transaction total count:"+count);
	




}
}
