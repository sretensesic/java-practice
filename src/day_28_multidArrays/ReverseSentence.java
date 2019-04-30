package day_28_multidArrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String sentence = "you are very interesting person";
		String [] words = sentence.split(" ") ;
		String reversed =" ";
		
		System.out.println(Arrays.toString(words));
		for(int i = words.length - 1; i >= 0; i--) {
			reversed = reversed+" "+words[i];
		}
		
		reversed = reversed.trim();
		System.out.println(reversed);
		
		
		
		
		
		
		
		
		
	}
}
