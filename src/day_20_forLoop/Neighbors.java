package day_20_forLoop;

import java.util.Scanner;

public class Neighbors {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 System.out.println("Enter word");
	 String word = scan.next();
	 //aabcdd 
	 //if character and next one are the same print
	 //Beeep - a
	 //Beeep - d
/*	 if(word.contains("aa")) {
		 System.out.println("beep - a");
	 }else if(word.contains("dd")) {
		 System.out.println("beep - d");
	 }
	 
	   :) :) :) :) :)               */
	 
	 for(int i = 0; i < word.length()-1; i++) {
		 if(word.charAt(i)== word.charAt(i+1)) {
			 System.out.println("Beep - "+word.charAt(i));
		 }
	 }
}
}
