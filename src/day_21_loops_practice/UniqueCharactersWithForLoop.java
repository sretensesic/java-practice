package day_21_loops_practice;

import java.util.Scanner;

public class UniqueCharactersWithForLoop {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word ;
		String unique = "";
		char ch ;
		int i=0;
		System.out.println("Enter a word:");
		word = scan.next();
		for(i=0; i<word.length(); i++){ //read the 'ch' and assign
			ch = word.charAt(i);
			if (!unique.contains(""+ch)) {
				unique += ch; //add to unique
			}
		}
		
		
	System.out.println(unique);
	
		
		
		
		
		
		
	}
}
