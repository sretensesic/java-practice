package day_16_stringManipulation;

import java.util.Scanner;

public class Replace {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Type words:");
	
	String words = scan.nextLine();
	
	System.out.println(words.replace("a","y"));
	
	System.out.println(words.replace("sad", "happy"));
	
	
	
	
	
}
}
