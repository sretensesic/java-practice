package day_20_forLoop;

public class EvenOrOdd {
	public static void main(String[] args) {
		//using for loop: 1-100
		//1.print all even numbers in some line
		
		//2.print all odd numbers in same line
		
		//3.sumOfodds, sumOfEvens - calculate and print
		//out after the loop
	
	for(int num = 1; num <= 100; num++) {
		if(num%2 == 0) {
		System.out.print(num+", ");
	}}
   
	System.out.println();
	
	for(int bum = 1; bum <= 100; bum++) {
		if(bum%2 == 1) { //or bum%2 != 0  would work as well
		System.out.print(bum+", ");
	}}
	
	System.out.println();
	
	int sumOfOdds = 0;
	int sumOfEvens = 0;
	
	for(int rum = 1; rum <=100; rum++) {
		if(rum % 2 == 0) {
			sumOfEvens += rum;
		}else {
			sumOfOdds += rum;
	}}
	       System.out.println("Sum of evens:"+sumOfEvens);
	       System.out.println("Sum of oods:"+sumOfOdds);
	}
}
