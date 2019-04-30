package day_30_methods02;

import java.util.Scanner;

public class print55stars {
	public static void main(String[] args) {
		print5Stars();// call the method
		//call print5Stars 100 times
	
		
		for(int i =0; i<=100; i++) {
			print5Stars();
		}
		introduce();
	}

  public static void print5Stars() {
	  System.out.println("*****");
	  
  }
  	public static void introduce() {
  		Scanner scan = new Scanner(System.in);
  
  String name =" ";
  		
  		
  		System.out.println("What is your name?");
  		name = scan.next();
  		System.out.println("Nace to meet you "+name);
}
  
  
}
