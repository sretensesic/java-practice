package day_32_methods4;

public class Method_With_Return {
public static void main(String[] args) {
		
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: "+i);
	
		System.out.println(giveMeYourName());
		String myName = giveMeYourName();
		System.out.println("My name is "+myName);
	}
	
	public static int giveMe10$() {
		System.out.println("Returning 10 from method");
		return 10;     //this method returns int value
	}
	public static String giveMeYourName() {
		String name = "Srele";
		return "Srele";
	}
}
