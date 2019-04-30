package day_16_stringManipulation;

import java.util.Scanner;

public class url {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	System.out.println("enter url: ");	
	String url = scan.next();
	
	
	if(url.startsWith("www.")) {
	
		System.out.println("web site starts with www");
	}else { 
		System.out.println("web site Doesn't start with www");
		return;
	}
		
		//check . is there before extension
	    //find out the length of the url
	//do -4 and using charAt get the character
	//compare if it is '.'
	int dotIndex = url.length()-4;
	//url.lastIndexOf(".");
	
	if(url.charAt(dotIndex)=='.') {
		System.out.println(". is there before extention");
	}else {
		System.out.println(". might be misplaced");
	}
	
/* if(url.charAt(url.length()-4 == '.'){
      }    would also work  */
 
	
	String domain = url.substring(4, dotIndex);
	
	System.out.println(domain);
	String extension= url.substring(dotIndex+1, url.length());
	 
	System.out.println(extension);
	
	
	}
}














