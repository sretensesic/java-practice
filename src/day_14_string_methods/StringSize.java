package day_14_string_methods;

public class StringSize {
public static void main(String[] args) {
	
	String str1 = "Good Morning";
	//check if matches "Good morning" and print match
	//or Not match
	
	if(str1.equals("Good Morning")) {
		System.out.println("Match");
	}else { 
		System.out.println("Not Match");
	}
	
	if(str1.equalsIgnoreCase("good morning")) {
		System.out.println("Match = ignore case");
	}else {
		System.out.println("Not match - ignore case");
	}
	
	System.out.println(str1.toUpperCase());
	System.out.println(str1);
	str1 =str1.toUpperCase(); // after  (toUpperCase) it will all come out upper case 
	System.out.println("After assignment: "+str1);
	
	//combine all above methods together:
	//covert to all lower case first then check if it equals("good morning")
	
	if(str1.toLowerCase().equals("good morning")){
		System.out.println("Chained methods: match");
	}else {
		System.out.println("Chained methods: do not match");
	}
	
		//FIND OUT HOW MANY CARACTERS IN THE STRING
	
	String myName = "Sreten";
	
	System.out.println(myName.length());
	
	int length = myName.length();
	System.out.println("My name's length:"+length);
	
	
	
	//Usernames must be exactly 8 characters.
	String userName = "Loznica";
	
	if(userName.length()== 8) { //checking if userName has 8 characters
		System.out.println("Valid username");
	}else {
		System.out.println("Invalid username, must be 8 chars");
	}
	 
	
	String password = "woodenSpoon";
	
	// 1) one way of doing it
	
	if(password.length()>= 6) {
		System.out.println("Password is good");
	}else {
		System.out.println("Password is too sshort");
	}
	// 2) second way of doing it
	
	int passwordLength= password.length();
	if(passwordLength < 6) {
		System.out.println("Invalid password. Too short");
	}else {System.out.println("Valid password");
	}
	
	
	
}
}
