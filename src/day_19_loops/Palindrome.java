package day_19_loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.) reverse it and assign to different
		/// 2) compare if it matches the word
		//1) check first and last char
		//2) second char and second char from end
		System.out.println("Enter word to test:");
		             //0123
		String word = "javaj";
		String reversed = "";
		// loop throug the word in reverse order
		//and concetanate each character to reversed string
		
		int idx = word.length()-1;
		while(idx >= 0) {
		reversed = reversed + word.charAt(idx);
			idx--;
		}
		
		System.out.println(reversed);
	
		//compare if word and reversed are equal
	    if(reversed.equalsIgnoreCase(word)){
	    	System.out.println("It is palindrome");
	    }else{
	    	System.out.println("It is not palindrome");
	    }
	}
}
