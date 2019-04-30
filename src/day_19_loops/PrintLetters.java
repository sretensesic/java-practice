package day_19_loops;

public class PrintLetters {
public static void main(String[] args) {
	String word = "Amazon";
	//print each character one by one in separate lines
	int idx = 0;
 while(idx < word.length()) {
	 System.out.println(word.charAt(idx));
	 idx++;
 }
 
	//print each characters in reverse order
 int idx2= word.length()-1; //5 
 while(idx2 >= 0) {
	 System.out.println(word.charAt(idx2));
	 idx--;
	
 }
	
}
}