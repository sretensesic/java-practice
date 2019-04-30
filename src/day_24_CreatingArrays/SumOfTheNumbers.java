package day_24_CreatingArrays;

import java.util.Arrays;

public class SumOfTheNumbers {
	public static void main(String[] args) {
		//lets create an array of integers with length 3
		int[] numbers = new int [3];
		
		//first value in array
		numbers[0] = 5;
		//second value in array
		numbers[1] = 10;
		//third value in array
		numbers[2] = 20;
		//this will printout a hash code
		System.out.println(numbers);
		//toString() from arrays help us to print an array as String		
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		//please use for loop in order to loop through
		//the array and calculate sum of all elements
		//number.length --> returns number of elements in the array
		//numbers.length = 5;
		for(int i = 0; i <numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum: "+sum);
		//find largest value in the array
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				
			}
			
		}
	System.out.println("Max value: "+max);
	// Find minimum value in the array
	int min = Integer.MAX_VALUE;
	for(int k = 0; k < numbers.length; k++) {
		if(numbers[k]<min){
			min = numbers[k];
		}
	}
	System.out.println("Min value: "+min);
	
	
	}
}
