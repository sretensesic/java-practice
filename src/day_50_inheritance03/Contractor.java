package day_50_inheritance03;

public class Contractor extends Employee {
	public void calculatePay(int hours, double rate) {
		double total = hours * rate + 200;
		System.out.println("Contractor total pay: "+ total);
	}
}
