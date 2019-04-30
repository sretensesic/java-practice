package day_12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter first number:");
	double number1 = scan.nextDouble();
	
	System.out.println("Enter second number; ");
	double number2 = scan.nextDouble();
	
	System.out.println("Select Operator: +, -, *, /, % ");
	String operator = scan.next();
	
	double result =0.0; //asign 0.0 to avoid errors
	
	
	if(operator.equals("+")) {
		result = number1 + number2;
	}else if (operator.equals("-")) {
		result= number1 - number2;
	}else if(operator.equals("*")) {
		result= number1*number2;
	}else if(operator.equals("/")) {
		result = number1 /  number2;
	}else if(operator.equals("%")) {
		result = number1 % number2;
	}else {
		System.out.println("Invalid operator selected: "+operator); //do not execute yhe remaining code.STOP HERE
	return;
	}
	
		System.out.println(result);
	 
	
}
}
