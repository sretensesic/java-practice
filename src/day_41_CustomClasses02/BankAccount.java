package day_41_CustomClasses02;

public class BankAccount {
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("depositing $"+amount+" to "+accountNumber);
		balance += amount;
	}
	public void withdraw(double amount) {
		System.out.println("withdrawing $"+amount+" from "+accountNumber);
		balance -= amount;
		if(balance < 0) {
			balance = balance - 35;
		}
	}
	public void showBallance() {
		System.out.println("===================");
		System.out.println("account Holder: "+accountHolder);
		System.out.println("account Number: "+accountNumber );
		System.out.println("Balance: "+balance);
	}
	
	public void charge(double price, String item) {
		if(balance >= price) {
			System.out.println("Buying "+item+" for$"+price+" from "+" account number: "+accountNumber);
		balance -= price;
		}else {
			System.out.println("Sorry, nor enough money!!! Cannot buy "+item+" for "+price);
		}
	}
}
