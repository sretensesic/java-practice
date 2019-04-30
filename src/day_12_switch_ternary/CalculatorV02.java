package day_12_switch_ternary;

public class CalculatorV02 {
public static void main(String[] args) {
	
	int result, number1, number2;
	String operator = "+";
	number1 = 2;
	number2 = 4;
	
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
		System.out.println("Invalid operator selected: "+operator); //do not execute the remaining code.STOP HERE
	return;
	}
	
		System.out.println(result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
