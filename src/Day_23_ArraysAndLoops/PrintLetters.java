package day_23_ArraysAndLoops;

public class PrintLetters {
	public static void main(String[] args) {
	
		for(int i = 0; i<3; i++) {
		//outer loop will repeat printing of letter as many times as want	

		//write a for loop that will print letter from 'a' to 'z'
		for(char letter = 'a'; letter <= 'z'; letter++) {
		
			System.out.print(letter);
		}
			System.out.println();
			System.out.println("****************************");
		
	}
}
}