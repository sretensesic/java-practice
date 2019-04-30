package day_15_string_manipulation;

public class Contains {
public static void main(String[] args) {
	String email = "test@gmail.com";
	
	System.out.println(email.contains("@")); //true because String emails contains character "@"
	
	String list = "potatoes, apples, eggs, milk, bread, cereal, meat";
	// Check if apples is in the shoping list
	//true ==> Apples are there!
	//false ==> Lets add apples now!
	
	if(list.contains("apples")) {
		System.out.println("Apples are there!");
	}else {
		System.out.println("Lets add apples now!");
	}
	
	boolean hasEggs = list.contains("eggs"); //true
	System.out.println("Contains eggs: "+hasEggs);
	
	boolean hasCucumbers = list.contains("cucumbers");//false because cucumbers are not assigned in String list
    System.out.println("contains cucumbers "+hasCucumbers);
	
	 email = "name@yahoo.com";
	 
	 if(email.contains("@yahoo")) {
	 System.out.println("Yahooo account");
	 }else if(email.contains("@gmail")) {
		 System.out.println("Gmail");
	 }
	
	 String etsyTitle = "Wooden spoon | Etsy";
	 if(etsyTitle.contains(" | ")) {
	 System.out.println("Pipe is there");
     }else {
	 System.out.println("Pispe is not there!");
    }

String name = "Sreten Sesic";

if(name.contains("t") || name.contains("s")) { 
	System.out.println("'t' and 's' are there"); // true because 's' and 't' are there
}else {
	System.out.println("Not there");
}










}
}
