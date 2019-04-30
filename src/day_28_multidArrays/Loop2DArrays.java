package day_28_multidArrays;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String[][] pizzas = {
				{"pineapple","pepperoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken", "tomatoes","japalenios","onions"},
				{"green pepers","zuccini","brocolli","spinach","shrimp"}};
	
	//System.out.println(Arrays.toString(pizzas[0]));
	
	 //for each loop
		for(String[] pizza : pizzas) {
			System.out.println(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
		}
	// for loop	
		System.out.println("*****FOR LOOP*****");
		
		for(int i = 0; i < pizzas.length; i++) {
			System.out.println(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for(String toping : pizzas[0]) {
			System.out.println(toping);
		}
	
		int [][] students = {{4,5,6},
							{12,5,6},
							{22,55,12,54,3}};
	
		//2 part: 1) outer loop and 2) inner loop
		for(int[] group :  students) {
			for(int studentID : group) {
				System.out.println(studentID+", ");
			
			}
		System.out.println();
		}
	
		int[][] nums = {
				{10,20},
				{20,30,40,50},
				{100,200,300},
				{555,333,111,444,666,78}};
	
	
	
	
	
	for(int i =0; i < nums.length; i++) {
		for(int  j=0; j < nums[i].length; j++) {
			System.out.println(nums[i][j]+" ");
	}
		System.out.println();
	}
}
}