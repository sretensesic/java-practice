package day_26_Array04;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		
	
	String words = "java,kava,html,selenium";
	String [] str  =words.split(",");

	
	System.out.println("Count: "+str.length);
	System.out.println(str[0]);
	System.out.println(Arrays.toString(str));
	//using for each loop
	for(String word : str) {
		System.out.println(word);
	}
	
	String diceResult = "1- 20 of 1,461 positions";
	//using Split method , print 1,461
	
	String[] position = diceResult.split(" ");
	System.out.println("Search result total: "+ position[4]);
	
	String[] position1 = diceResult.split("of");
	System.out.println(position1[0].trim());
	System.out.println(position1[1].trim());

	System.out.println("************************");

	String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
	String[] allWords = sentence.split(" ");
	String[] happySplit = sentence.split("happy");
	String[] ISplit = sentence.split("I");
	
	for(String w : allWords) {
		System.out.println(w);
	}
	
	System.out.println("************************");
	
	String word = "java";
	char[] charsArray = word.toCharArray();
	
	for(char ch : charsArray) {
		System.out.println(ch);
	}
	int[] statt = new int[4];
	
	
	}
}