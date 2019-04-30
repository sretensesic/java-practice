package day_10_logicalOperators;

public class IFstatementWithBooleanVariables {
public static void main(String[] args) {
	
	
	boolean isBreakTime = true;
	
	if(isBreakTime == false) {
		System.out.println("BREAK TILL 8:35 PM");
	}else {
		System.out.println("No Break time yet.");
	}
	
	boolean classTime = false;
		if(classTime== false) {
			System.out.println("Come back on timr");
			System.out.println("Stop talking");
			System.out.println("Pay aAttention");
	}else {
		System.out.println("Take a walk and have some water.");
	}
	
	
	boolean qualified = false;
	if(qualified != true) {                           //we can use either != true or == ffalse boolean
		System.out.println("Your application was not approved. Thank you");
	}
	
	
	
}
}
