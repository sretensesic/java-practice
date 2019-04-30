package day_33_Methods_With_Return;


public class CalcTest {
public static void main(String[] args) {
		
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.divide(86, 42));
		System.out.println(Calculator.multiply(48, 224));
		System.out.println(Calculator.minus(46,25));
		 // in this example we are calling methods from another class and assigning the values
		
		int addResult = Calculator.add(21, 45);
		double minusResult = Calculator.minus(34,31);
		double multyResult = Calculator.multiply(46, 38);
		double divideResult = Calculator.divide(84, 25);
		
		System.out.println("add Result: "+addResult);
		System.out.println("multy Result: "+multyResult);
		System.out.println("minus Result: "+minusResult);
		System.out.println("divide Result: "+divideResult);
		
		
		double a = 10.0, b = 5.0;
		double myResult = Calculator.minus(a, b);
		System.out.println("My result: "+myResult);
		
		double[] dNums = {2.0, 4.0};
		double result2 = Calculator.multiply(dNums[0], dNums[1]);
		System.out.println("Result2: "+result2);
		
		if(Calculator.add(10, 16)== 26) {
			System.out.println("Add Unit Test Passed");
		}else {
			System.out.println("Add Unit Test Failed");
		}
	
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is for characters");
		}else {
			System.out.println("It is not 4 characters");
		}
	
	}
}
