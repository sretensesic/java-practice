package day_31_methods3;

import java.util.Arrays;

public class MethodWithStrings {
	public static void main(String[] args) {
		countWords("java is not fun");
		countWords("this is method with String");
		googleSearchResult("About 121,000,000 results (0.75 seconds)");
		String resultsStr = "156,000,000 results (0.73 seconds)";
		
		googleSearchResult(resultsStr);
		
	}
	
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Words in this sentence "+Arrays.toString(words));
		System.out.println("Number of words: "+words.length);
	
	}

	public static void googleSearchResult(String result) {
		String[] str = result.split(" ");
		String count = str[1].replace(",", "");
		String seconds = str[3].replace("(", "");
		
		System.out.println("Result count: "+count);
		System.out.println("Time in seconds: "+seconds);
		
	}



}
