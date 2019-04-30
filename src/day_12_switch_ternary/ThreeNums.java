package day_12_switch_ternary;

import java.util.Scanner;

public class ThreeNums {
	public static void main(String[] args) {
		
		int n1 = 100;
		int n2 = 55;
		int n3 = 10;
		
		if(n1 >  n2 && n1 > n3) {
			System.out.println("n1 is bigger");
		}else if(n2 >  n1 && n2 > n3) {
			System.out.println("n2 is bigger");
		}else if(n3 >  n1 && n3 > n2) {
			System.out.println("n3 is bigger");
		} 
		
		
		
		Scanner s = new Scanner(System.in);
	    
		   String chicken = "chicken";
		   String burger = "burger";
		   String soda = "soda";
		    
		    String in = s.next();
		    
		    //your code here
		if( in == "chicken"){
		System.out.println("10.0");
		}else if(in == "soda"){
		  System.out.println("2.0");
		}
		
		
		
		
		
	}

}
