package day_28_multidArrays;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {
		String[][] teams=new String[2][6];
		
		teams [0][0] = "Irina";
		teams [0][1] = "Zarif";
		teams [0][2] = "Cihan";
		teams [0][3] = "Habib";
		teams [0][4] = "Adel";
		teams [0][5] = "Bojan";

		teams [1][0] = "Olimjon";
		teams [1][1] = "Mirshood";
		teams [1][2] = "Usman";
		teams [1][3] = "Nursultan";
		teams [1][4] = "Roman";
		teams [1][5] = "Dmitriy";

		System.out.println("First player of first team: ");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][1]);
		System.out.println(teams[0][2]);
		
		//print how many row/teams/arrays
		System.out.println("Number of rows: "+teams.length);
		System.out.println("People of in first team "+ teams[0].length);
		System.out.println("People of in second team "+ teams[1].length);
		
		//array inside an array
		System.out.println(Arrays.deepToString(teams));

	
		int[][] nums = new int [3][4];
		nums[0][1] = 100;
		nums[0][2] = 1030;
		nums[0][3] = 500;
		

		nums[1][0] = 5000;
		nums[1][1] = 4600;
		nums[1][2] = 600;
		

		nums[2][0] = 500;
		nums[2][1] = 1600;
		nums[2][2] = 700;
		

		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));
	
	
	//mutidim. array
		int[][] scores = {{3,5,10},{6,4,2,10}};
		System.out.println("Days played/Number of arrays:"+scores.length);
		System.out.println("Number of values in 1: "+scores[0].length);
		System.out.println("Number of values in 2: "+scores[1].length);

	
		int[][] values = new int[4][];
		values[0] = new int [] {34, 23, 5};
		values[1] = new int [] {34, 54, 54, 546, 76,98,23};
		
		values[2] = new int [2];
		values[2][0] = 55;
		values[2][1] = 88;
	
		values[3] = new int[] {5, 12, 45, 77, 34};
	
	
		System.out.println(Arrays.deepToString(values));
	
	}
}
