package day_14_string_methods;

public class CharAt {
  public static void main(String[] args) {
	
	  String word = "Computer";
	  
	  System.out.println(word.charAt(0)); //printing first character 
	  System.out.println(word.charAt(1));
	  System.out.println(word.charAt(2));
	  System.out.println(word.charAt(7));
	  
	  
	  String word2 = "Java";
	  System.out.println(word2.charAt(2)); //checking if it matches
	  if(word2.charAt(2)== 'v') {
		  System.out.println("v is second char");
	  }else {
		  System.out.println("v is NOT second char");
	  }

     //***********************************************
     String word3 = "civic";
     char first = word3.charAt(0);
     char last = word3.charAt(4);
     
     
     if(word3.charAt(0) == word3.charAt(4)) {
    	 System.out.println("char 0 matches char 4");
     }else {
    	 System.out.println("char 0 doesn't match char 4");
     }
     //************************************************
     
     //String word4 => always print the last character no matter the length
     
     String word4 = "asdfghjhgvcxcvg";
     char lastChar = word4.charAt(word4.length()-1);
     
     System.out.println("Last value of "+word4+" is "+lastChar);
  
  
  }
}
