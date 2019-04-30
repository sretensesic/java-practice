package day_33_Methods_With_Return;

public class Calculator {
	public static void main(String[] args) {
		addVoid(2,5);
		//int result = addVoid(5,1);   it will not work 
		//because addVoid does not return a value. it just perform action
		
		int result = add(4,8);
		System.out.println(result);
		System.out.println(add(4,8));
	
		double resultMulty =multiply(4.6, 8.6);
		System.out.println(resultMulty);
	
		
		double resultDivide = divide(84.6,9);
		System.out.println(resultDivide);
		
		
		double resultMinus = minus(87.1, 54.3);
		System.out.println(resultMinus);
	}
		public static void addVoid(int num1, int num2) {
			int sum = num1 +  num2;
			System.out.println("Sum is: "+sum);
			
		}
		public static int add (int num1,  int num2) {
			
			int sum = num1 + num2;
			
			return sum;
			}
		public static double multiply(double num1, double num2) {
			double sum1 = num1 * num2 ;
			return sum1;
		}
		public static double divide(double num1 ,double num2) {
			if(num2 == 0) {
				System.out.println("ERROR: Can not / by 0 !!!");
				return 0;   //to make code working 
			}else {
			double sum2 = num1 / num2 ;
			return sum2;
		}
		}
		public static double minus(double num1 ,double num2) {
			double sum3 = num1 - num2 ;
			return sum3;
		}
	
}
