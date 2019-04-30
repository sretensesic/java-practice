package day_29_methods01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Capitals {
	public static void main(String[] args) {
		String[][] countries = {{"USA","Washington DC"},
				             {"Canada", 	"Ottawa"},
				             {"Mexico","Mexico city"},
				             {"Brasil","Brasilia"},
				             {"Peru", "Lima"},
				             {"Argentina", "Boanes Aeros"},
				             {"Bolivia","La Paz"},
				             {"Macedonia","Scopia"},
				             {"Kazakhstann","Nursultan"}};
				
		
		
	/*	System.out.println(countries[0][0]+" | "+countries[1][0]);
		System.out.println(countries[0][0]+" | "+countries[0][2]);
		/*System.out.println(countries[0][2]+" | "+countries[3][0]);
		System.out.println(countries[0][3]+" | "+countries[4][0]);
		System.out.println(countries[0][4]+" | "+countries[5][0]);
		//System.out.println(countries[0][5]+" | "+countries[6][0]); */
System.out.print(Arrays.deepToString(countries));
		
		System.out.println();
		//print all countries in same line separated by |
		// for loop
		
		for(int i = 0; i < countries.length; i++) {
			System.out.println(countries[i][0]+" | ");
		}
		System.out.println();
		// for each loop
		for(String[] country:countries) {
		System.out.println(country[0]+" | ");
		}
		
		System.out.println();
		//get all the cities and add to cities[] array
		//declare cities array and size needs to match countries Array size
		//		String [] cities = new String[9];

		String [] cities = new String[countries.length];
		// null means no object. is is not same as empty string
		
		System.out.println(Arrays.toString(cities));
		
		System.out.println();
		
		for(int i =0; i < countries.length; i++) {
			cities[i] = countries[i][1];
		}
		System.out.println(Arrays.toString(cities));
		
		//look for Bolivia incountries and test if
		// capital is La Paz
		
		for(int row = 0;row<countries.length; row++){
			if(countries[row][0].equals("Bolivia")) {
				//System.out.println(countries[row][1]);
				if(countries[row][1].contentEquals("La Paz")) {
					System.out.println("Bolivia test pased");
				}else {
					System.out.println("Bolivia test failed");
				}
				break; // exit the loop
			}
		}
		
		
		
	}
}
