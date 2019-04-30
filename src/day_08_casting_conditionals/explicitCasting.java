package day_08_casting_conditionals;

public class explicitCasting {
public static void main(String[] args) {
	
	System.out.println(10/2.0); //result is double because double is bigger than int. Implicit
	
	
	int result = (int)(10/2.0);
	
	System.out.println("Result: "+result);
	
	
	int rent1 = 987;
	int rent2 = 1100;
	int rent3 =894;
	int rent4 = 1234;
	
	
	//Explicit needs to be typed exact type using parenthesis
	
	double average = (rent1+rent2+rent3+rent4) / 4;
	System.out.println("Average: "+average);
	
	double d = 40.2;
	int i = (byte)d;
	
	// in above statement both explicit and inplicit casting happening
	
	// explicit: double > byte
	// implicit byte > int
	
	
	
	
	
	
	
	
	
}
}
