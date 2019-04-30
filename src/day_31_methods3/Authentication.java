package day_31_methods3;

import java.util.Scanner;

public class Authentication {
	public static void main(String[] args) {
		
		Login("picaMala", "kicoMehki");
		
		
		
	}
	public static void Login(String username, String password) {
	String validUsername ="mentoring@cybertekschool.com ";	
	String validPassword = "mentor001";
	
	if(username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
		System.out.println("Login succesfull:");
	}else{
		System.out.println("Sign in failed");
	
	}
	}



}
