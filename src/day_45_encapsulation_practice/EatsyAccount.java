package day_45_encapsulation_practice;

import java.util.Random;

public class EatsyAccount {
	private String email;
	private String firstName;
	private String password;
	
	//constructor 1. No-args. sets all as empty string
	public EatsyAccount() {
		email = "";
		firstName = "";
		password = "";
	}
	//constructor 2.
	//takes 3 args and sets them to instance
	//using setters
	public EatsyAccount(String email, String firstName, String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}
	//constructor 3.
	//email, firstName
	//password is auto generated and asiigned
	public EatsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();
	}
	
	private String getRandomPassword() {
		Random rand = new Random();
		String letters = "abcdefghijklmnoprstquvwyz0123456789";
		String rdPassword = "";
		for(int i = 1; i<=6; i++) {
			rdPassword+=letters.charAt(rand.nextInt(letters.length()));
		}
		return rdPassword;
	}
	@Override
	public String toString() {
		return "EatsyCAcount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		//if it contains @ somewhere in the midle. assign it
		//if not print "Please enter a valid address."
		if(email.indexOf("@") > 0 && email.indexOf("@") < email.length()-1) {
		this.email = email;
		}else {
			System.out.println("Please enter a valid address.");
		}
	}
	public String getFirstName() {
		return firstName;
	}
	//cant be blank
			//needs to be only Alphabetic/Letters
	private boolean isValidFirstName(String firstName) {
		
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		
		if(firstName.isEmpty()) {
			System.out.println("Cannot be blank");
			return false;
		}
		
		for(int i = 0; i<firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if(!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
		}
		return true;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	public String getPassword() {
		if(isValidFirstName(firstName)) {
			this.firstName = firstName;
		}
		return password;
	}
	public void setPassword(String password) {
		if(password.length()<6) {
			System.out.println("Must be at least 6 characters");
		}else {
		this.password = password;
		} 
	}
	
	
}
