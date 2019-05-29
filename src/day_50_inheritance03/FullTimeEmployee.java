package day_50_inheritance03;

public class FullTimeEmployee extends Employee {
	@Override //check if method is really override
	public void calculatePay(int hours, double rate) {
		double total = (hours * rate)* 1.05 + (hours * rate);
		System.out.println("FullTimeEmployee total pay: "+ total);
	}
}
