package day_31_methods3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		add(3.8, 5.6);
		subtruct(5.8, 4.2);
		multiply(7.8, 8);
		divide(8.5,3);
		remainder(98.9, 7);
		//using Scanner pass 2 numbers and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+', '-', '*', '/','%'");
		String operator = scan.next();
		//using switch statement, call the matching method to perform call
	
		switch(operator) {
		case "+":
			add(n1, n2);
			break;
		case "-":
			subtruct(n1, n2);
			break;
		case "*":
			multiply(n1, n2);
			break;
		case "/":
			divide(n1, n2);
			break;
		case "%":
			remainder(n1, n2);
			break;
			default:
		System.out.println("Invalid operator");
		}
	
	}
	//add, subtract, multiply, divide, remainder
	
	
	public static void add( double num1, double num2) {
		double result = num1+num2;
		System.out.println("Result: "+result);
	}

	public static void subtruct( double num1, double num2) {
		double result = num1-num2;
		System.out.println("Result: "+result);
	}

	public static void multiply( double num1, double num2) {
		double result = num1*num2;
		System.out.println("Result: "+result);
	}

	public static void divide( double num1, double num2) {
		double result = num1/num2;
		if(num2 == 0) {
			System.out.println("cannot / by zero");
			return; // exit the method here, do not run the rest
		}
		System.out.println("Result: "+result);
	}

	public static void remainder( double num1, double num2) {
		double result = num1%num2;
		System.out.println("Result: "+result);
	}
}
