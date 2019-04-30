package day_11_logical_nestedif;

import java.util.Scanner;

public class LoinTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		
		
		System.out.println("Enter username:");
		String username = scan.next();
		System.out.println("Enter paasword:");
	     String password = scan.next();
	     
	   
	     
	     
	     
	     if(validUsername.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
	     System.out.println("Login Successsful, Welcome");
	    }else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
	    	System.out.println("Invalid Username and Invalid Password");
	    }else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
	    	System.out.println("Invalid Password");
	    }else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
	    	System.out.println("Invalid Password");
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
