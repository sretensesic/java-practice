package day_41_CustomClasses02;

public class CapitalOne {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.accountHolder = "Bill Gates";
		acc1.deposit(250);
		acc1.accountNumber =  123456;
		acc1.withdraw (100);
		acc1.showBallance();
		
		acc1.charge(50, "wooden spoon");
		acc1.showBallance();
	}
}
