package day_16_stringManipulation;

public class IsEmpty {
public static void main(String[] args) {
	
	String userName = "";
	String password = "";
	
	System.out.println(userName.isEmpty()); //true
	
	if(userName.isEmpty()) {
		System.out.println("Username field cannot be empty");
	}else {
		System.out.println("Username is not empty");
	}
	
	if(userName.isEmpty() || password.isEmpty()) {
		System.out.println("Username or password cannot be emppty");
	}else {
		System.out.println("Username is not empty");
	}
	//CTRL + SHIFT +F to make code look nice
	
	
	// .isEmpty gives you true or false and we can asign it into boolean
	
	
	
	
	
	
	
	
	
	
	
	
}
}
