package day_15_string_manipulation;

public class SubSrting {
public static void main(String[] args) {
	
	String sentence = "Java String manipulation is fun!";
	System.out.println(sentence.substring(0,8)); //Java
	
	
	System.out.println(sentence.substring(5,11)); //String
	System.out.println(sentence.substring(7, 11)); //ring
	System.out.println(sentence.substring(10,15)); //error because not enough characters
	
	

	
	
	
	
	
	
	
}
}
