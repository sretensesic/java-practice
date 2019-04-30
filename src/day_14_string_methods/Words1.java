package day_14_string_methods;

import java.util.Scanner;

public class Words1 {
public static void main(String[] args) {
	 
	Scanner scan = new Scanner(System.in);
	
	
	String word1, word2;
	
	System.out.println("Word1 value:");
	word1 = scan.next();
	System.out.println("Word2 value");
	word2 = scan.next();
	if(word1.length()> word2.length()) {
    System.out.println("word1 rules!");
	}else  {
		System.out.println("word2 is the boss!");
	}
}
}