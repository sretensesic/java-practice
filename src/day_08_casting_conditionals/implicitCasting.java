package day_08_casting_conditionals;

public class implicitCasting {
	public static void main(String[] args) {
	
		//automatic casting smaller to larger type
		
		
		short shortValue = 3455;
		int intValue = shortValue; // int ontValue = (int) shortValue; optional
		
		System.out.println("int value: "+shortValue);
		
		
		double price = 345;
		System.out.println("Price after casting: "+price);
		
		
		int price1 = 34563;
		double dPrice = price1;
		System.out.println("dPrice after casting: "+dPrice);
		
		
	}

}
