package day_16_stringManipulation;

public class CapitalCity {
public static void main(String[] args) {
	
	String str = "Moscow is a capital of Russia";
	//Baku, Azerbaijan
	
	str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
	
	System.out.println(str);
	
	String email = "firstName_LastName@gmail.com";
	String company = "deloite";
	
	String newEmail = email.replace("gmail" , company);
	System.out.println(newEmail);






}
}
