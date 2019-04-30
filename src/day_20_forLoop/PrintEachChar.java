package day_20_forLoop;

public class PrintEachChar {
	public static void main(String[] args) {
		String word = "Wooden Spoon";
		//using for loop, print each char one by one 
		for(int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		}
		
		System.out.println();
		
		//using for loop, print only consonants
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(!(letter =='a' || letter == 'e' || letter =='o' || letter == 'i'
				|| letter =='u')) {
				System.out.print(letter + ", ");
			}}
		
		
		//using for loop, print only vowel (a,e,o,i,u)
		System.out.println();
		
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(letter =='a' || letter == 'e' || letter =='o' || letter == 'i'
				|| letter =='u') {
				System.out.print(letter + ", ");
			}}
		
	
	}
}
